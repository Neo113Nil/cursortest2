package xsna;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.vk.api.generated.account.dto.AccountGetInfoFieldsDto;
import com.vk.avatarchange.CropAvatarView;
import com.vk.biometric.auth.impl.di.BiometricAuthComponentImpl;
import com.vk.camera.editor.common.di.CommonEditorComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.phoneactualization.impl.di.PhoneActualizationComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.aq5;
import xsna.bbv0;
import xsna.cs;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l35 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ l35(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                if (SakFeatures.Type.SAK_MIGRATION_ACCOUNT_GET_INFO.h()) {
                    return cs.a.a((13 & 4) != 0 ? null : "nom", null, Collections.singletonList("country"));
                }
                List singletonList = Collections.singletonList(AccountGetInfoFieldsDto.COUNTRY);
                ufx ufxVar = new ufx("account.getInfo", new wr(z), new xr(z));
                List list = singletonList;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountGetInfoFieldsDto) it.next()).i());
                }
                ufxVar.h("fields", arrayList);
                return ufxVar;
            case 1:
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr = BiometricAuthComponentImpl.b;
                return new l47();
            case 3:
                return pn00.k(new Pair("Chrome Mobile", "com.android.chrome"), new Pair("Yandex Browser", "com.yandex.browser"), new Pair("Firefox Mobile", "org.mozilla.firefox"), new Pair("Opera Mobile", "com.opera.browser"));
            case 4:
                return "hideChannel: ";
            case 5:
                return s3q0.a;
            case 6:
                return new ryt0();
            case 7:
                qcy<Object>[] qcyVarArr2 = ClipsViewersSdkComponentImpl.l;
                return new bkw();
            case 8:
                qcy<Object>[] qcyVarArr3 = CommonEditorComponentImpl.h;
                return new dng0();
            case 9:
                int i = CropAvatarView.u;
                aq5.a.getClass();
                return aq5.a.b;
            case 10:
                iyk0 iyk0Var = hbp.a;
                return ael.a;
            case 11:
                return new zys();
            case 12:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            case 13:
                bbv0.g.getClass();
                bbv0.a.f().d.i();
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return new n5w(new d5w(EmptyList.b, jgp.b, EmptySet.b, false, false, false, true, null, false), new ProfilesInfo());
            case 16:
                return Pattern.compile("\\[((?:id|club)[0-9]+)\\|([^]]+)]");
            case 17:
                return new zqu();
            case 18:
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                return k840.a.c();
            case 21:
                return s3q0.a;
            case 22:
                qcy<Object>[] qcyVarArr4 = PhoneActualizationComponentImpl.c;
                return new j2a0();
            case 23:
                return new som0();
            case 24:
                return new PorterDuffColorFilter(e43.a.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
            case 25:
                return s3q0.a;
            case 26:
                return new oei0();
            case 27:
                return new o6j0(0);
            case 28:
                return Float.valueOf(Resources.getSystem().getDisplayMetrics().density);
            default:
                int i2 = StickyMusicPlayerBottomSheet.c0;
                return Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_CONCERTS_INFORMER.h());
        }
    }
}
