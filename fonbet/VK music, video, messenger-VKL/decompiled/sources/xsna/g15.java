package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.search.integration.api.SearchDelegate;
import com.vk.search.params.api.SearchParams;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b26;
import xsna.owg;
import xsna.x1t0;

/* compiled from: AudiobookListContent.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class g15 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g15(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoRestriction O;
        switch (this.b) {
            case 0:
                break;
            case 1:
                SearchParams searchParams = (SearchParams) obj;
                lm6 lm6Var = (lm6) this.receiver;
                ((yh90) lm6Var.f.getValue()).h(searchParams);
                f0i0 f0i0Var = lm6Var.e;
                if (f0i0Var.b) {
                    SearchDelegate.SearchState searchState = f0i0Var.f;
                    f0i0Var.e = true ^ searchParams.I();
                    SearchDelegate.SearchState a = f0i0Var.a();
                    f0i0Var.f = a;
                    if (searchState != a) {
                        f0i0Var.a.invoke();
                    }
                }
                lm6Var.g.h5(searchParams);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                izs<Boolean, s3q0> izsVar = ((n69) this.receiver).b;
                if (izsVar != null) {
                    izsVar.invoke(bool);
                }
                break;
            case 3:
                rmf rmfVar = (rmf) obj;
                ((pmf) this.receiver).getClass();
                ListBuilder e = e43.e();
                for (VideoFile videoFile : rmfVar.d) {
                    Integer L3 = videoFile.L3();
                    e.add(new m2t0(new n2t0(videoFile, epx.f(videoFile.a1(), rmfVar.f), (L3 != null ? L3.intValue() : 0) < rmfVar.e)));
                }
                VKList vKList = new VKList(e.g());
                vKList.n(rmfVar.h);
                break;
            case 4:
                lvg lvgVar = (lvg) obj;
                yvg yvgVar = (yvg) this.receiver;
                yvgVar.getClass();
                yvgVar.T(new owg.a.c(lvgVar.a, lvgVar.b, lvgVar.c, yvgVar.h, lvgVar.d));
                break;
            case 5:
                GoodAlbum goodAlbum = (GoodAlbum) obj;
                kih kihVar = (kih) this.receiver;
                int i = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null) {
                    zih.a(kihVar.E, p8uVar, new s8u(goodAlbum, p8uVar), null, 12);
                }
                break;
            case 6:
                ((p9k) this.receiver).e.onError((Throwable) obj);
                break;
            case 7:
                Throwable th = (Throwable) obj;
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                xam.y.a(th);
                ktk0 ktk0Var = xamVar.t;
                ktk0Var.c = false;
                ktk0Var.e = th;
                xamVar.e1();
                b26.b bVar = xamVar.x;
                if (bVar != null) {
                    b26 b26Var = b26.this;
                    b26Var.g(b26.a.BAR, b26Var.l, 0L);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 8:
                ((Boolean) obj).getClass();
                sem semVar = ((mem) this.receiver).s;
                if (semVar != null) {
                    semVar.c().dismiss();
                }
                break;
            case 9:
                ((vrh0) this.receiver).f(((Boolean) obj).booleanValue());
                break;
            case 10:
                g3t0 g3t0Var = (g3t0) this.receiver;
                VideoFile videoFile2 = g3t0Var.n;
                if (videoFile2 != null && ((O = videoFile2.O()) == null || O.f)) {
                    g3t0Var.l.Vh(new x1t0.d.a(videoFile2));
                }
                break;
            default:
                ((com.vk.auth.ui.password.askpassword.a) this.receiver).a((vgg) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g15(Object obj, int i) {
        super(1, obj, pmf.class, "buildItems", "buildItems(Lcom/vk/clips/attachments/impl/feature/video/ClipsVideoAttachmentState;)Lcom/vk/dto/common/data/VKList;", 0);
        this.b = i;
        switch (i) {
            case 6:
                super(1, obj, p9k.class, "onSyncContactError", "onSyncContactError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
            case 10:
            default:
                break;
            case 8:
                super(1, obj, mem.class, "onMsgDeleteSuccess", "onMsgDeleteSuccess(Z)V", 0);
                break;
            case 9:
                super(1, obj, vrh0.class, "setParamsButtonHighlighted", "setParamsButtonHighlighted(Z)V", 0);
                break;
            case 11:
                super(1, obj, com.vk.auth.ui.password.askpassword.a.class, "handleError", "handleError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0);
                break;
        }
    }
}
