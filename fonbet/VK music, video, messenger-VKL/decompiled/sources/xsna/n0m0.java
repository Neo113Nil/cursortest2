package xsna;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.account.dto.AccountSaveProfileInfoResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoUploadDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.log.L;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import java.util.List;
import kotlin.Pair;
import xsna.nhw0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class n0m0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ n0m0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Integer.valueOf(((k9l0) obj).o);
            case 1:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_excluded_users");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                return new sa30();
            case 3:
                return new Pair((GetStoriesResponse) obj, null);
            case 4:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                ur60 ur60Var = ((v4n0) obj).c;
                boolean z = ur60Var.f;
                ListLoadingState listLoadingState = ur60Var.e;
                sq60 sq60Var = ur60Var.b;
                boolean z2 = z || (sq60Var.a.isEmpty() && (listLoadingState == ListLoadingState.RELOADING || listLoadingState == ListLoadingState.LOADING));
                boolean z3 = (ur60Var.g && !z2) || (sq60Var.a.isEmpty() && listLoadingState == ListLoadingState.ERROR);
                return new k5n0(ur60Var.b, ur60Var.e, z2, z3, sq60Var.a.isEmpty() && !z3 && !z2 && listLoadingState == ListLoadingState.IDLE);
            case 5:
                return af10.a((TagsGetListResponseDto) obj);
            case 6:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.d0);
            case 7:
                qgi0.r((tgi0) obj, "upload_cell_middle");
                return s3q0.a;
            case 8:
                return yxq0.a((dwq0) obj);
            case 9:
                qgi0.r((tgi0) obj, "verification_stub_toolbar_back");
                return s3q0.a;
            case 10:
                PhotosPhotoUploadDto photosPhotoUploadDto = (PhotosPhotoUploadDto) obj;
                return new ncq0(photosPhotoUploadDto.e(), photosPhotoUploadDto.d(), null, null, null, 28);
            case 11:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).n;
            case 12:
                return ((AccountSaveProfileInfoResponseDto) obj).d() == BaseBoolIntDto.YES ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new IllegalStateException("Account description change failed"));
            case 13:
                L.i((Throwable) obj);
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 18:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 19:
                nhw0.b bVar = (nhw0.b) ((it80) obj).a;
                if (bVar != null) {
                    com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                    dhw0 dhw0Var = com.vk.voip.ui.c.O;
                    cVar.X0(dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, bVar.n, bVar.o, bVar.p, bVar.q, bVar.r, bVar.s, null, null, false, false, 0, null, bVar.t, false, false, false, null, null, -67108737, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW) : null);
                }
                return s3q0.a;
            case 20:
                Task task = (Task) obj;
                while (!task.isComplete()) {
                }
                if (task.isSuccessful()) {
                    return (String) task.getResult();
                }
                ApiException apiException = (ApiException) task.getException();
                if (apiException == null || apiException.g() != 15002) {
                    throw new IllegalStateException("ApiException is null");
                }
                throw apiException;
            default:
                return io.reactivex.rxjava3.core.q.H(new Exception());
        }
    }
}
