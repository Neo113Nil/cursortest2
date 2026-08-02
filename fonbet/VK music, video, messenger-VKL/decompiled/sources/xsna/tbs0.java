package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.mvp.holder.video.seasons.VideoSeasonFilterVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.fxw0;
import xsna.omt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tbs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tbs0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                rzo rzoVar = (rzo) this.c;
                ubs0 ubs0Var = (ubs0) this.d;
                UserId userId = rzoVar.a;
                int i = rzoVar.d;
                int i2 = rzoVar.b;
                ArrayList arrayList = ubs0Var.a.b;
                ho hoVar = new ho("video.getComments", 1);
                hoVar.C(i, "video_id");
                hoVar.F(userId, "owner_id");
                hoVar.C(i2, "start_comment_id");
                hoVar.C(1, "count");
                hoVar.C(1, "extended");
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UsersFieldsDto) it.next()).i());
                }
                hoVar.G("fields", arrayList2);
                hoVar.C(1, "photo_sizes");
                return rsg0.y0(hoVar, null, null, 3);
            case 1:
                wes0 wes0Var = (wes0) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                return wes0Var.a.c.a(videoFile).U(new h8e0(new j5b0(videoFile, 28), 4));
            case 2:
                ((VideoSeasonFilterVh) this.c).b.a((UIBlockActionFilter) ((UIBlock) this.d), true);
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke(new omt0.c.a(((vmt0) this.d).b, (VideoTextureView) obj));
                return s3q0.a;
            case 4:
                kwu0 kwu0Var = (kwu0) this.c;
                String str = (String) this.d;
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException == null || !vKApiExecutionException.X()) {
                    mzp0 mzp0Var = kwu0Var.d;
                    if (mzp0Var != null) {
                        mzp0Var.f();
                    }
                } else {
                    kwu0Var.c(str);
                }
                L.i(th);
                return s3q0.a;
            case 5:
                ((m6w0) this.c).U((VmojiPurchaseProductResponseDto) obj, (VmojiProductModel) this.d);
                return s3q0.a;
            default:
                pww0 pww0Var = (pww0) this.c;
                Pair pair = (Pair) obj;
                fxw0.a a = fxw0.a.a((fxw0.a) ((fxw0) this.d), (CallId) pair.d(), null, 0L, 0L, null, null, null, null, false, false, false, false, false, (String) pair.g(), null, null, null, false, null, null, false, false, 33488894);
                return pww0Var.Y(a, pww0Var.V(a));
        }
    }
}
