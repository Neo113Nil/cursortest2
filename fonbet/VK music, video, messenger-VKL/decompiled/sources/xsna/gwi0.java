package xsna;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.widget.PopupWindow;
import androidx.preference.Preference;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.h7u0;
import xsna.i9r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gwi0 implements io.reactivex.rxjava3.core.d, VkTooltip.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gwi0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
        VkTooltip vkTooltip = (VkTooltip) this.c;
        VkTooltip.a aVar = (VkTooltip.a) this.d;
        vkTooltip.a(new dtv0((PopupWindow) this.e, 0));
        VkTooltip.b bVar = aVar.n;
        if (bVar != null) {
            bVar.b(dismissReason);
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.voip.ui.sessionrooms.d dVar = (com.vk.voip.ui.sessionrooms.d) obj3;
                SessionRoomId sessionRoomId = (SessionRoomId) obj2;
                ParticipantId participantId = (ParticipantId) obj;
                dVar.a.getClass();
                SessionRoomsManager D = OKVoipEngine.D();
                if (D != null) {
                    D.moveParticipant(new MoveParticipantParams.Builder(sessionRoomId).setParticipantId(participantId).build(), new kfg(dVar, sessionRoomId, bVar, 4), new ap30(bVar, 16));
                    break;
                }
                break;
            default:
                final SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj3;
                final Preference preference = (Preference) obj;
                int i2 = SettingsGeneralFragment.z0;
                int i3 = h7u0.p;
                h7u0.a c = h7u0.b.c(settingsGeneralFragment.kn());
                c.g0(R.string.sett_clear_all_and_logout);
                c.U(R.string.clear_all_and_logout_desc);
                c.c0(R.string.vk_ok, new DialogInterface.OnClickListener() { // from class: xsna.w1j0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(final DialogInterface dialogInterface, int i4) {
                        final SettingsGeneralFragment settingsGeneralFragment2 = SettingsGeneralFragment.this;
                        final Preference preference2 = preference;
                        SettingsGeneralFragment.ro("ClearAllAndLogoutClicked");
                        i9r0.a aVar = i9r0.a;
                        synchronized (i9r0.class) {
                            synchronized (i9r0.a) {
                                Iterator<T> it = o25.a().g().iterator();
                                while (it.hasNext()) {
                                    i9r0.a.e((UserId) it.next());
                                }
                            }
                        }
                        String b = b6m.b(preference2.h());
                        tfx tfxVar = new tfx("account.unregisterDevice", new mq(0), new l4(1));
                        if (b != null) {
                            tfx.o(tfxVar, "device_id", b, 0, 0, 12);
                        }
                        io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(tfxVar), 7).o(BaseOkResponseDto.OK), new i3u(preference2, 12));
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        asu0.a.getClass();
                        settingsGeneralFragment2.m0.b(rVar.s(4L, timeUnit, asu0.i(), null).subscribe(new io.reactivex.rxjava3.functions.f(settingsGeneralFragment2, preference2, dialogInterface) { // from class: xsna.y1j0
                            public final /* synthetic */ Preference b;
                            public final /* synthetic */ DialogInterface c;

                            {
                                this.b = preference2;
                                this.c = dialogInterface;
                            }

                            @Override // io.reactivex.rxjava3.functions.f
                            public final void accept(Object obj4) {
                                int i5 = SettingsGeneralFragment.z0;
                                ((ActivityManager) this.b.h().getSystemService("activity")).clearApplicationUserData();
                                this.c.dismiss();
                            }
                        }, new lub(settingsGeneralFragment2, preference2, dialogInterface)));
                    }
                });
                c.W(R.string.cancel, new x1j0());
                ((androidx.appcompat.app.d[]) obj2)[0] = c.m();
                break;
        }
    }
}
