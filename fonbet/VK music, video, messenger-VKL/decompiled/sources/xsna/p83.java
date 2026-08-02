package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.common.view.settings.RadioButtonGroupSettingsView;
import com.vk.common.view.settings.RadioButtonSettingsView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.log.L;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.actions.WebActionSticker;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b430;
import xsna.e3m;
import xsna.h7u0;
import xsna.irt0;
import xsna.pdg0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class p83 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p83(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        Object i;
        int i2 = this.b;
        int i3 = 32;
        int i4 = 0;
        int i5 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = (AppRedirectsSettingsFragment) obj4;
                j83 j83Var = (j83) obj2;
                Context context = ((AppRedirectsSettingsFragment.a) obj3).itemView.getContext();
                int h = j83Var.a.h();
                List<App> list = j83Var.c;
                App app2 = j83Var.b;
                defpackage.c cVar = new defpackage.c(i5, appRedirectsSettingsFragment, j83Var);
                int i6 = AppRedirectsSettingsFragment.L0;
                RadioButtonGroupSettingsView radioButtonGroupSettingsView = new RadioButtonGroupSettingsView(context, null, 0, 14, 0);
                radioButtonGroupSettingsView.setOrientation(1);
                e3m.a aVar = e3m.a;
                radioButtonGroupSettingsView.setBackground(m33.a(R.drawable.highlight, context));
                float f = 8;
                f4m.y(iah0.a(f), radioButtonGroupSettingsView);
                f4m.x(iah0.a(f), radioButtonGroupSettingsView);
                f4m.w(iah0.a(f), radioButtonGroupSettingsView);
                int i7 = 0;
                for (Object obj5 : list) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        e43.t();
                        throw null;
                    }
                    App app3 = (App) obj5;
                    float f2 = f;
                    int i9 = i7;
                    int i10 = i5;
                    RadioButtonSettingsView radioButtonSettingsView = new RadioButtonSettingsView(context, null, 0, 14, 0);
                    radioButtonSettingsView.setId(app3.ordinal());
                    radioButtonSettingsView.setChecked(app3 == app2 ? i10 : 0);
                    radioButtonSettingsView.setText(y53.b(app3, context));
                    Drawable a = m33.a(app3.h(), context);
                    if (a != null) {
                        Drawable mutate = a.mutate();
                        float f3 = i3;
                        mutate.setBounds(0, 0, iah0.a(f3), iah0.a(f3));
                        int a2 = iah0.a(f2);
                        AppCompatRadioButton appCompatRadioButton = radioButtonSettingsView.b;
                        appCompatRadioButton.setCompoundDrawablePadding(a2);
                        appCompatRadioButton.setCompoundDrawables(mutate, null, null, null);
                    }
                    radioButtonSettingsView.setRadioButtonTextPadding(iah0.a(4));
                    float f4 = 10;
                    int a3 = iah0.a(f4);
                    int a4 = iah0.a(f4);
                    radioButtonSettingsView.setPadding(a3, a4, a3, i9 == list.size() + (-1) ? 0 : a4);
                    radioButtonGroupSettingsView.addView(radioButtonSettingsView);
                    i7 = i8;
                    f = f2;
                    i5 = i10;
                    i3 = 32;
                }
                h7u0.a aVar2 = new h7u0.a(context);
                aVar2.g0(h);
                aVar2.f = radioButtonGroupSettingsView;
                aVar2.c = i5;
                aVar2.c0(R.string.save, new n83(i4, cVar, radioButtonGroupSettingsView));
                aVar2.W(R.string.cancel, null);
                androidx.appcompat.app.d m = aVar2.m();
                appRedirectsSettingsFragment.J0 = m;
                radioButtonGroupSettingsView.setOnCheckedChangeListener(new r83(m != null ? m.h.j : null, app2));
                return s3q0.a;
            case 1:
                ((AtomicReference) obj4).set(new pdg0.a(new pdg0.a.C3506a(((mla) obj3).e.toString(), (Throwable) obj)));
                ((CountDownLatch) obj2).countDown();
                return s3q0.a;
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (((l06) obj4).c()) {
                    str = "";
                }
                qgi0.q(tgi0Var, str);
                qgi0.h(tgi0Var, str2);
                return s3q0.a;
            case 3:
                b430 b430Var = (b430) obj4;
                ?? r15 = (FunctionReferenceImpl) obj2;
                int i11 = b430.a.$EnumSwitchMapping$1[((ModerationRestriction) obj3).ordinal()];
                if (i11 == 1) {
                    k530.b(b430Var.a, b430Var.d, b430Var.c, r15, null, 8);
                } else if (i11 == 2) {
                    b430Var.a.a(b430Var.d, b430Var.c);
                }
                return s3q0.a;
            case 4:
                String str3 = (String) obj3;
                List list2 = (List) obj2;
                qyg0 V0 = ((hyg0) obj).V0((String) obj4);
                try {
                    V0.D3(1, str3);
                    Iterator it = list2.iterator();
                    int i12 = 2;
                    while (it.hasNext()) {
                        V0.D3(i12, (String) it.next());
                        i12++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i13 = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i14 = (int) V0.getLong(3);
                        if (i14 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i14 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i14 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i14 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i14 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList.add(new hc50(i13, downloadingState, b, l2, V0.l2(4)));
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 5:
                vz80 vz80Var = (vz80) obj4;
                String str4 = (String) obj3;
                zqa zqaVar = (zqa) obj2;
                String str5 = vz80Var.d;
                String k0 = str5 != null ? drm0.k0(str5, "?", str5) : null;
                if (k0 == null || k0.length() == 0) {
                    return vz80Var.e.a(zqaVar);
                }
                i = vhk0.i(vz80Var.b, v1v.a(' ', str4, k0), (r5 & 2) == 0, new xdf(2), new defpackage.c(27, vz80Var, zqaVar));
                return i;
            case 6:
                L.i((Throwable) obj);
                ((fid0) obj4).e((wk50.a) obj3, (a.C0919a) obj2);
                return s3q0.a;
            case 7:
                WebActionSticker webActionSticker = (WebActionSticker) obj4;
                szl0 szl0Var = (szl0) obj3;
                String str6 = (String) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i15 = webActionSticker.b;
                return i15 != 0 ? new w690(i15, webActionSticker.c, bitmap, (int) szl0Var.a, str6) : new ad7(bitmap, (int) szl0Var.a, WebStickerType.STICKER, str6);
            default:
                VideoFile videoFile = (VideoFile) obj4;
                Context context2 = (Context) obj2;
                videoFile.Xa(false);
                videoFile.u7(null);
                ((wzs) obj3).invoke(videoFile, null);
                VideoFileOld copy = videoFile.copy();
                copy.A0 = SystemClock.elapsedRealtime();
                wjs0.a(new fyr0(copy));
                wjs0.a(new wxr0(copy, null, null, 6));
                cvk.w(g620.f().c(videoFile) ? context2.getString(R.string.clip_delete_success) : context2.getString(R.string.video_delete_success, videoFile.getTitle()), false);
                if (bps0.a != null) {
                    long j = videoFile.I0().b;
                    Integer valueOf = Integer.valueOf(videoFile.o0());
                    r2u0 r2u0Var = dst0.b;
                    qg90<UserId, Integer> qg90Var = new qg90<>(new UserId(j), valueOf);
                    r2u0Var.getClass();
                    bpn0 bpn0Var = irt0.d;
                    CachedVideoViewedSegments a5 = irt0.b.a().a(qg90Var);
                    if (a5 != null) {
                        a5.Xa(true);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ p83(String str, String str2, List list, fb50 fb50Var) {
        this.b = 4;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p83(b430 b430Var, c530 c530Var, ModerationRestriction moderationRestriction, gzs gzsVar) {
        this.b = 3;
        this.c = b430Var;
        this.d = moderationRestriction;
        this.e = (FunctionReferenceImpl) gzsVar;
    }
}
