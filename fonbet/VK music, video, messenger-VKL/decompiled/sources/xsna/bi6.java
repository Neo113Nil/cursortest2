package xsna;

import android.content.Context;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsJoinAndGetResponseDto;
import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.feature.uxpolls.modalpoll.e;
import com.vk.uxpolls.presentation.view.PollsWebView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xn50;

/* compiled from: BaseMusicRestrictionPopupDisplayer.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi6 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                lw4 lw4Var = (lw4) obj;
                com.vk.music.notifications.restriction.a aVar = (com.vk.music.notifications.restriction.a) this.receiver;
                aVar.getClass();
                bn40.f(lw4Var);
                aVar.b.K(lw4Var.a());
                i0q0.f(new com.vk.catalog2.common.ui.holders.a(4, aVar, lw4Var));
                return s3q0.a;
            case 1:
                ((ke8) this.receiver).t.setText((CharSequence) obj);
                return s3q0.a;
            case 2:
                ((j4e) this.receiver).getClass();
                return Boolean.valueOf(((ClipsFavoritesFolderRenamingState) obj).c == ClipsFavoritesFolderRenamingState.SaveState.None);
            case 3:
                ((qme) this.receiver).a((Context) obj);
                return s3q0.a;
            case 4:
                ((iqf) this.receiver).T((ttf) obj);
                return s3q0.a;
            case 5:
                p8k.U((p8k) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 6:
                ((z37) this.receiver).b((cro) obj);
                return s3q0.a;
            case 7:
                yc50 yc50Var = (yc50) this.receiver;
                yc50Var.getClass();
                xn50.a.c(yc50Var, (lc50) obj);
                return s3q0.a;
            case 8:
                ((vn60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 9:
                d1b0 d1b0Var = (d1b0) this.receiver;
                d1b0Var.getClass();
                xn50.a.c(d1b0Var, (c1b0) obj);
                return s3q0.a;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 11:
                ovn0 ovn0Var = (ovn0) this.receiver;
                ovn0Var.getClass();
                xn50.a.c(ovn0Var, (jun0) obj);
                return s3q0.a;
            case 12:
                com.vk.feature.uxpolls.modalpoll.e eVar = (com.vk.feature.uxpolls.modalpoll.e) obj;
                UxPollsModalFragment uxPollsModalFragment = (UxPollsModalFragment) this.receiver;
                int i = UxPollsModalFragment.f0;
                uxPollsModalFragment.getClass();
                if (eVar instanceof e.b) {
                    ((e.b) eVar).a.printStackTrace();
                } else {
                    if (!epx.f(eVar, e.a.C1028a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PollsWebView pollsWebView = uxPollsModalFragment.X;
                    if (pollsWebView == null) {
                        pollsWebView = null;
                    }
                    pollsWebView.hide();
                }
                return s3q0.a;
            default:
                AppsJoinAndGetResponseDto appsJoinAndGetResponseDto = (AppsJoinAndGetResponseDto) obj;
                q73 q73Var = (q73) this.receiver;
                q73Var.getClass();
                if (!appsJoinAndGetResponseDto.e()) {
                    throw new IllegalStateException("Can't perform application installation is_joined = false");
                }
                ykg ykgVar = q73Var.a;
                AppsAppDto d = appsJoinAndGetResponseDto.d();
                ykgVar.getClass();
                return ykg.c(d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(com.vk.music.notifications.restriction.a aVar) {
        super(1, aVar, com.vk.music.notifications.restriction.a.class, "showRestrictionPopup", "showRestrictionPopup(Lcom/vk/music/offline/configs/api/domain/model/AudioRestrictionInfo;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(Object obj, int i) {
        super(1, obj, j4e.class, "mapIsDialogCancelable", "mapIsDialogCancelable(Lcom/vk/clips/favorites/impl/ui/folders/renaming/ClipsFavoritesFolderRenamingState;)Z", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, qme.class, "launch", "launch(Landroid/content/Context;)V", 0);
                break;
            case 6:
                super(1, obj, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                break;
            case 8:
                super(1, obj, vn60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
