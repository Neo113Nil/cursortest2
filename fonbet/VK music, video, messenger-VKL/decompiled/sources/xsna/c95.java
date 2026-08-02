package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vkontakte.android.R;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.cwb0;
import xsna.s9j0;
import xsna.vpc0;
import xsna.xf8;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class c95 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c95(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                ja5 ja5Var = (ja5) this.receiver;
                ((zak0) ja5Var.a).setValue(la5.a(ja5Var.a(), 0, swe0.g(intValue, 0, Math.max(ja5Var.a().a, 1) - 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11));
                return s3q0.a;
            case 1:
                ((io.reactivex.rxjava3.core.y) this.receiver).onSuccess((Cipher) obj);
                return s3q0.a;
            case 2:
                s9j0 s9j0Var = (s9j0) obj;
                wf8 wf8Var = (wf8) this.receiver;
                if (s9j0Var instanceof s9j0.c) {
                    wf8Var.z.a();
                    wf8Var.z.c(new cwb0.s0(null, R.string.voip_broadcast_share_in_progress, 5), new ic(wf8Var, 9));
                } else if (s9j0Var instanceof s9j0.a) {
                    wf8Var.z.a();
                    zk70.e(((s9j0.a) s9j0Var).a);
                    wf8Var.d(xf8.i.a);
                } else if (s9j0Var instanceof s9j0.d) {
                    wf8Var.z.a();
                    enj.q(R.string.voip_broadcast_share_done, 0, wf8Var.a);
                    wf8Var.d(xf8.i.a);
                } else {
                    wf8Var.z.a();
                }
                return s3q0.a;
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 5:
                ((r7u) this.receiver).c((Throwable) obj);
                return s3q0.a;
            case 6:
                ((s8b0) this.receiver).getClass();
                i0q0.f(new wp40((yj40) obj, 12));
                return s3q0.a;
            case 7:
                PostingState postingState = (PostingState) obj;
                ((vpc0) this.receiver).getClass();
                if (postingState instanceof PostingState.Editing) {
                    MediaPickerState.SheetState sheetState = ((PostingState.Editing) postingState).f.h;
                    int i = sheetState == null ? -1 : vpc0.a.$EnumSwitchMapping$0[sheetState.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            return 5;
                        }
                        if (i == 2) {
                            return 4;
                        }
                        if (i == 3) {
                            return 3;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
            default:
                Attach attach = (Attach) obj;
                z8q0 z8q0Var = (z8q0) this.receiver;
                z8q0Var.getClass();
                return Boolean.valueOf((attach instanceof AttachPlaylist) && epx.f(((AttachPlaylist) attach).b, z8q0Var.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c95(Object obj, int i) {
        super(1, obj, ja5.class, "updateSettledPage", "updateSettledPage(I)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
            case 6:
            default:
                break;
            case 5:
                super(1, obj, r7u.class, "onConfirmAdultError", "onConfirmAdultError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, vpc0.class, "mapMediaPickerSheetCurrentState", "mapMediaPickerSheetCurrentState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Ljava/lang/Integer;", 0);
                break;
            case 8:
                super(1, obj, z8q0.class, "filterAttachPlaylist", "filterAttachPlaylist(Lcom/vk/dto/attaches/Attach;)Z", 0);
                break;
        }
    }
}
