package xsna;

import android.view.View;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionRestoreAudioResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.utils.newtork.d;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.log.L;
import com.vk.mentions.MentionProfileVO;
import com.vk.photoviewer.PhotoViewPager;
import com.vk.video.ui.edit.privacy.PrivacyEditVideoWatchFragment;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.JsonParsers;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.eb20;
import xsna.i7j0;
import xsna.ng20;
import xsna.sv00;
import xsna.tj50;
import xsna.u6x;
import xsna.vn20;
import xsna.yzx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s6x implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ s6x(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object lambda$static$3;
        AttachWithDownload attachWithDownload;
        File i1;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((u6x.b) obj).e() == null);
            case 1:
                return new yzx.c(((tj50.a) obj).a(szx.b, ao8.d));
            case 2:
                lambda$static$3 = JsonParsers.lambda$static$3(obj);
                return lambda$static$3;
            case 3:
                if (!(obj instanceof Iterable)) {
                    obj = Collections.singletonList(obj);
                }
                return (Iterable) obj;
            case 4:
                return new sv00.b(((tj50.a) obj).a(ov00.b, ao8.d));
            case 5:
                UserProfile userProfile = (UserProfile) obj;
                UserId userId = userProfile.c;
                String str = userProfile.e;
                String str2 = userProfile.h;
                String str3 = userProfile.d;
                String str4 = userProfile.q;
                if (str4 == null) {
                    str4 = "";
                }
                return new MentionProfileVO(userId, str, str2, str3, str4);
            case 6:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 7:
                eb20.a aVar = (eb20.a) obj;
                Dialog dialog = aVar.c;
                ProfilesInfo profilesInfo = aVar.e;
                int i = aVar.b;
                return (dialog == null || profilesInfo == null || i == 0) ? ng20.a.a : new ng20.b(i, profilesInfo, dialog, aVar.d);
            case 8:
                ((zak0) vn20.g).setValue((vn20.c) obj);
                return s3q0.a;
            case 9:
                Integer d = ((KidsCollectionRestoreAudioResponseDto) obj).d();
                return Integer.valueOf(d != null ? d.intValue() : 0);
            case 10:
                Attach attach = (Attach) obj;
                if (!(attach instanceof AttachWithDownload) || ((i1 = (attachWithDownload = (AttachWithDownload) attach).i1()) != null && i1.exists() && i1.length() != 0 && !attachWithDownload.X6())) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 11:
                return ((PeersSearchBlock.c) obj).b;
            case 12:
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
            case 13:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (it.hasNext()) {
                        if (((UIBlock) it.next()).Cb().i()) {
                            return Boolean.valueOf(r1);
                        }
                    }
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 14:
                return s3q0.a;
            case 15:
                L.l("OKVoipAudioManager", ms9.b("incoming onError=", (Throwable) obj));
                return s3q0.a;
            case 16:
                View view = (View) obj;
                view.setPadding(cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(16));
                view.setClipToOutline(true);
                return s3q0.a;
            case 17:
                ((Integer) obj).getClass();
                int i2 = PhotoViewPager.c;
                return Boolean.TRUE;
            case 18:
                i0q0.f(new ubw((yj40) obj, 24));
                return s3q0.a;
            case 19:
                qgi0.r((tgi0) obj, "PollExitDialogDescription");
                return s3q0.a;
            case 20:
                return Boolean.valueOf(((u1c0) obj).c == 350);
            case 21:
                L.i((Throwable) obj);
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                qcy<Object>[] qcyVarArr = PrivacyEditVideoWatchFragment.a1;
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                L.g("Error on observe session rooms dismissed event", (Throwable) obj);
                return s3q0.a;
            case 28:
                return Boolean.valueOf(j5g.P(nyi0.a, fpf0.a(obj.getClass())));
            default:
                i7j0.a aVar2 = (i7j0.a) obj;
                return new j7j0(aVar2.a, aVar2.b, aVar2.c);
        }
    }
}
