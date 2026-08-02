package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.instantjobs.InstantJob;
import java.util.List;
import kotlin.Pair;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class f4r implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f4r(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                apd apdVar = (apd) obj;
                ClipsDecorationPaginationKey s1 = apdVar.s1();
                PaginationKey nextPageWithDecoration = s1 != null ? new PaginationKey.NextPageWithDecoration(s1) : PaginationKey.LoadedFull.b;
                List<Pair<SdkClipVideoFile, ClipsFeedDecorationPayload>> b = apdVar.b();
                boolean z = this.c;
                PaginationKey paginationKey = z ? nextPageWithDecoration : PaginationKey.LoadedFull.b;
                if (z) {
                    nextPageWithDecoration = PaginationKey.LoadedFull.b;
                }
                return new bpd(b, nextPageWithDecoration, paginationKey);
            default:
                return r7x.a.a((r7x.a) obj, this.c, InstantJob.a.f.a, 1);
        }
    }
}
