package xsna;

import android.graphics.PointF;
import android.view.View;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zzor;
import com.google.android.gms.maps.model.LatLng;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.likes.dto.LikesReactionThemeColorDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.SharingCommand;
import xsna.uwk;

/* compiled from: CommunityAddContactsView.kt */
/* loaded from: classes5.dex */
public final class edi implements znj, d4q, q701, uwk, mdw, d000, gn60, hcj0 {
    public static final jai c = new jai(1643548510, new ddi(0), false);
    public static final jai d;
    public static final edi e;
    public static final edi f;
    public static final /* synthetic */ edi g;
    public final /* synthetic */ int b;

    static {
        new jai(-1580551120, new md8((byte) 0, 4), false);
        d = new jai(-564448197, new a76((byte) 0, 2), false);
        e = new edi(2);
        f = new edi(5);
        g = new edi(6);
    }

    public /* synthetic */ edi(int i) {
        this.b = i;
    }

    public static final void A(hif0 hif0Var, float[] fArr) {
        hif0Var.a.set(fArr[0], fArr[1]);
        hif0Var.b.set(fArr[2], fArr[3]);
        hif0Var.c.set(fArr[4], fArr[5]);
        hif0Var.d.set(fArr[6], fArr[7]);
    }

    public static final LatLng B(edr0 edr0Var) {
        return new LatLng(edr0Var.a, edr0Var.b);
    }

    public static final hif0 C(float[] fArr) {
        return new hif0(new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7]));
    }

    public static final kif0 D(hif0 hif0Var) {
        float[] a = hif0Var.a();
        return new kif0(o(a), n(a));
    }

    public static final ZonedDateTime E(long j) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), TimeZone.getDefault().toZoneId());
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, xsna.ogn] */
    public static final io.reactivex.rxjava3.disposables.c j(yvj yvjVar, Runnable runnable, long j, izs izsVar) {
        kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        io.reactivex.rxjava3.disposables.f fVar = new io.reactivex.rxjava3.disposables.f(new bv9(ref$ObjectRef, 14));
        Objects.requireNonNull(runnable, "run is null");
        Runnable runnable2 = (Runnable) izsVar.invoke(new ovg0(fVar, coroutineContext, runnable));
        if (!zvj.f(yvjVar)) {
            return EmptyDisposable.INSTANCE;
        }
        if (j <= 0) {
            runnable2.run();
            return fVar;
        }
        ref$ObjectRef.element = qsl.d(coroutineContext).J(j, runnable2, coroutineContext);
        return fVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|28|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        xsna.xx1.p(r5, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(io.reactivex.rxjava3.disposables.c cVar, kotlin.coroutines.d dVar, Runnable runnable, spj spjVar) {
        nvg0 nvg0Var;
        int i;
        if (spjVar instanceof nvg0) {
            nvg0Var = (nvg0) spjVar;
            int i2 = nvg0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nvg0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = nvg0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nvg0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (cVar.h()) {
                        return s3q0.a;
                    }
                    x1e0 x1e0Var = new x1e0(runnable, 5);
                    nvg0Var.L$0 = dVar;
                    nvg0Var.label = 1;
                    if (myc0.k(EmptyCoroutineContext.b, new box(x1e0Var, null), nvg0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (kotlin.coroutines.d) nvg0Var.L$0;
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        nvg0Var = new nvg0(spjVar);
        Object obj2 = nvg0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nvg0Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    public static final PostingNavigationState l(PostingNavigationState postingNavigationState) {
        List<PostingStep> list = postingNavigationState.b;
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(e43.h(list), PostingStep.a((PostingStep) j5g.i0(arrayList), EmptyList.b));
        return new PostingNavigationState(arrayList);
    }

    public static final f8h0 m(io.reactivex.rxjava3.core.w wVar) {
        if (!(wVar instanceof vcn)) {
            return new f8h0(wVar);
        }
        ((vcn) wVar).getClass();
        return null;
    }

    public static final float n(float[] fArr) {
        double d2 = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(fArr[4] - fArr[2], d2)) + ((float) Math.pow(fArr[5] - fArr[3], d2)));
        return sqrt < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : sqrt;
    }

    public static final float o(float[] fArr) {
        double d2 = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(fArr[2] - fArr[0], d2)) + ((float) Math.pow(fArr[3] - fArr[1], d2)));
        return sqrt < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : sqrt;
    }

    public static void p(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void q(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static final PostingStep t(PostingNavigationState postingNavigationState) {
        return (PostingStep) j5g.i0(postingNavigationState.b);
    }

    public static nqv u(lg90 lg90Var, pco pcoVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            pcoVar = null;
        }
        if ((i2 & 8) != 0) {
            gzsVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-565469729, i, -1, "com.vk.core.compose.component.spinner.Spinner.CustomContent.Icon.Companion.invoke (Spinner.kt:25)");
        }
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i3 & 896) | 70;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1747031886, i4, -1, "com.vk.core.compose.component.spinner.remember (IconImpl.kt:49)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new nqv(lg90Var, pcoVar, gzsVar);
            aVar.R(x);
        }
        nqv nqvVar = (nqv) x;
        ((zak0) nqvVar.a).setValue(lg90Var);
        ((zak0) nqvVar.b).setValue(pcoVar);
        ((zak0) nqvVar.c).setValue(null);
        ((zak0) nqvVar.d).setValue(gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return nqvVar;
    }

    public static boolean v(UserId userId, fyr0 fyr0Var, VideoFileOld videoFileOld) {
        VideoFile videoFile = fyr0Var.a;
        if (videoFileOld != null) {
            boolean z = (videoFile.C2() || videoFile.v()) ? false : true;
            if (fkq0.b(userId)) {
                if (z) {
                    Owner s = videoFile.s();
                    if (epx.f(s != null ? s.b : null, userId)) {
                        z = true;
                    }
                }
                z = false;
            }
            boolean z2 = (epx.f(videoFile.getTitle(), videoFileOld.l) && epx.f(videoFile.j1(), videoFileOld.m) && epx.f(videoFile.getPrivacy(), videoFileOld.x0) && epx.f(videoFile.getImage(), videoFileOld.I0) && epx.f(videoFile.e1(), videoFileOld.J0)) ? false : true;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    public static ThemedColor w(LikesReactionThemeColorDto likesReactionThemeColorDto) {
        String e2 = likesReactionThemeColorDto.e();
        Integer a = e2 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", e2) : null;
        String d2 = likesReactionThemeColorDto.d();
        return new ThemedColor(a, d2 != null ? io.reactivex.rxjava3.internal.operators.mixed.n.a("#", d2) : null);
    }

    public static final void y(UIBlockList uIBlockList, izs izsVar, izs izsVar2) {
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (UIBlock uIBlock : arrayList) {
            if (uIBlock instanceof UIBlockList) {
                y((UIBlockList) uIBlock, izsVar, izsVar2);
            } else if (((Boolean) izsVar.invoke(uIBlock)).booleanValue()) {
                uIBlock = (UIBlock) izsVar2.invoke(uIBlock);
            }
            arrayList2.add(uIBlock);
        }
        uIBlockList.y.clear();
        uIBlockList.y.addAll(arrayList2);
    }

    public static final void z(hif0 hif0Var, kif0 kif0Var) {
        hif0Var.a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = hif0Var.b;
        float f2 = kif0Var.a;
        pointF.set(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF2 = hif0Var.c;
        float f3 = kif0Var.b;
        pointF2.set(f2, f3);
        hif0Var.d.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
    }

    @Override // xsna.uwk
    public ufx c(String str, Integer num, Integer num2, Integer num3) {
        return uwk.a.a(str, num, num2, num3);
    }

    @Override // xsna.d4q
    public boolean d(wmj wmjVar) {
        return ohk0.o(wmjVar).i().i();
    }

    @Override // xsna.mdw
    public io.reactivex.rxjava3.disposables.c e(t3h t3hVar) {
        return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    }

    @Override // xsna.d4q
    public boolean f(wmj wmjVar) {
        return ohk0.o(wmjVar).i().i();
    }

    @Override // xsna.znj
    public void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1915277465);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1915277465, i2, -1, "com.vk.design.demo.presentation.screens.legacyMenuScopeContent.<anonymous>.<no name provided>.Content (ContextMenuScreenContent.kt:1162)");
            }
            if (oq.h(-652224535, M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv7(this, znjVar, i, 3);
        }
    }

    @Override // xsna.hcj0
    public ksr i(ttk0 ttk0Var) {
        return new ssr(SharingCommand.START);
    }

    public tfx r(ArrayList arrayList) {
        tfx tfxVar = new tfx("database.getCitiesById", new io.reactivex.rxjava3.internal.operators.observable.n0(14), new dr(11));
        tfxVar.i("city_ids", arrayList);
        return tfxVar;
    }

    public tfx s(ArrayList arrayList) {
        tfx tfxVar = new tfx("database.getCountriesById", new fr(13), new gr(9));
        tfxVar.i("country_ids", arrayList);
        return tfxVar;
    }

    public String toString() {
        switch (this.b) {
            case 5:
                return "TraceBasedExemplarFilter";
            case 22:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // xsna.gn60
    public List x(Pair pair, bp5 bp5Var) {
        Float l;
        ArticleAttachment articleAttachment = (ArticleAttachment) pair.g();
        new egi();
        String i = egi.i(articleAttachment.f.h);
        Article article = articleAttachment.f;
        Owner owner = article.h;
        int i2 = (owner == null || !fkq0.b(owner.b)) ? R.string.article_author_user : R.string.article_author_group;
        Photo photo = article.l;
        String str = "H," + ((photo == null || (l = his0.l(photo)) == null) ? 1.7777778f : l.floatValue()) + ":1";
        String str2 = article.f;
        if (str2 == null) {
            str2 = "";
        }
        return Collections.singletonList(new u9d0(str2, new Triple(null, Integer.valueOf(i2), i), article.l, str, mnh0.G(bp5Var)));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzor.zzg());
    }

    @Override // xsna.d000
    public void b(gzs gzsVar) {
    }

    @Override // xsna.d000
    public void h(atm atmVar) {
    }

    @Override // xsna.mdw
    public void a(View view, qtd0 qtd0Var, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, l9 l9Var) {
    }
}
