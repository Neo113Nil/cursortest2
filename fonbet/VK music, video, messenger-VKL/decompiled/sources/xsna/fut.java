package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.X3;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import ru.ok.android.commons.http.Http;

/* compiled from: GetStaticPreviewBitmapUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.staticpreview.GetStaticPreviewBitmapUseCase$execute$2", f = "GetStaticPreviewBitmapUseCase.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class fut extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    final /* synthetic */ BoundingBox $bbox;
    final /* synthetic */ int $height;
    final /* synthetic */ boolean $isLightTheme;
    final /* synthetic */ List<lif0> $rects;
    final /* synthetic */ float $screenDensity;
    final /* synthetic */ int $width;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ gut this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fut(int i, int i2, gut gutVar, BoundingBox boundingBox, float f, boolean z, List<? extends lif0> list, spj<? super fut> spjVar) {
        super(2, spjVar);
        this.$width = i;
        this.$height = i2;
        this.this$0 = gutVar;
        this.$bbox = boundingBox;
        this.$screenDensity = f;
        this.$isLightTheme = z;
        this.$rects = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fut(this.$width, this.$height, this.this$0, this.$bbox, this.$screenDensity, this.$isLightTheme, this.$rects, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return ((fut) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x02ee -> B:7:0x02f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y8x y8xVar;
        long j;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        okhttp3.p pVar;
        Ref$ObjectRef ref$ObjectRef2;
        T t;
        okhttp3.p pVar2;
        Ref$ObjectRef ref$ObjectRef3;
        int i;
        Object k;
        okhttp3.v vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.a.a(obj);
            int i4 = this.$width;
            int i5 = this.$height;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{efz.a(i4, i5, "width=", ", height=")});
            }
            int i6 = this.$width;
            int i7 = this.$height;
            while (i6 != 0 && i7 != 0) {
                if (i6 <= 1024 && i7 <= 1024) {
                    y8xVar = new y8x(y8x.a(i6, i7));
                    break;
                }
                int b = an10.b((i7 / i6) * 1024);
                if (b <= 1024) {
                    y8xVar = new y8x(y8x.a(1024, b));
                    break;
                }
                int i8 = i7;
                i7 = i6;
                i6 = i8;
            }
            y8xVar = null;
            if (y8xVar != null) {
                j = y8xVar.a;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"size=" + ((Object) y8x.b(j))});
                }
                gut gutVar = this.this$0;
                BoundingBox boundingBox = this.$bbox;
                boolean z = this.$isLightTheme;
                List<lif0> list = this.$rects;
                gutVar.getClass();
                List<lif0> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    str = null;
                } else {
                    List<lif0> list3 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    for (lif0 lif0Var : list3) {
                        arrayList.add(new BoundingBox(lif0Var.f(), lif0Var.k(), lif0Var.g(), lif0Var.l(), null));
                    }
                    str = zr.a("{\"type\":\"FeatureCollection\",\"features\":[", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new py(28), 30), "]}");
                }
                StringBuilder sb = new StringBuilder("{");
                sb.append("\"bbox\": [{\"lat\":" + Coordinate.e(boundingBox.W()) + ", \"lon\":" + Coordinate.f(boundingBox.W()) + "}, {\"lat\":" + Coordinate.e(boundingBox.K()) + ", \"lon\":" + Coordinate.f(boundingBox.K()) + "}]");
                sb.append(',');
                StringBuilder sb2 = new StringBuilder("\"width\": ");
                sb2.append((int) (j >> 32));
                sb.append(sb2.toString());
                sb.append(',');
                StringBuilder sb3 = new StringBuilder("\"height\": ");
                sb3.append((int) (4294967295L & j));
                sb.append(sb3.toString());
                sb.append(',');
                StringBuilder sb4 = new StringBuilder("\"style\": \"");
                sb4.append(z ? X3.i.Z : "dark");
                sb4.append('\"');
                sb.append(sb4.toString());
                sb.append(",\"scale\": 1,\"padding\": 10");
                if (str != null && str.length() != 0) {
                    sb.append(',');
                    sb.append("\"features\": ".concat(str));
                }
                sb.append('}');
                String sb5 = sb.toString();
                p.a aVar = new p.a();
                aVar.i("https://maps.vk.com/api/staticmap/png?api_key=970de7f4731bd90e8927a656f11093ddbe02f31d1f8a2f437dfd8f2ca10220d3");
                aVar.c.h("Content-type", "application/json");
                aVar.c.h(Http.Header.ACCEPT, "application/json");
                t.a aVar2 = okhttp3.t.Companion;
                Pattern pattern = okhttp3.m.e;
                okhttp3.m a = m.a.a("application/json");
                aVar2.getClass();
                aVar.f("POST", t.a.a(sb5, a));
                okhttp3.p b2 = aVar.b();
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"request=" + b2});
                }
                ref$ObjectRef = new Ref$ObjectRef();
                gut gutVar2 = this.this$0;
                this.L$0 = b2;
                this.L$1 = ref$ObjectRef;
                this.L$2 = ref$ObjectRef;
                this.J$0 = j;
                this.I$0 = 1;
                this.label = 1;
                gutVar2.getClass();
                Object k2 = myc0.k(hqu0.b(), new eut(gutVar2, b2, null), this);
                if (k2 != coroutineSingletons) {
                    pVar = b2;
                    ref$ObjectRef2 = ref$ObjectRef;
                    t = k2;
                }
                return coroutineSingletons;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i = this.I$0;
                j = this.J$0;
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                okhttp3.p pVar3 = (okhttp3.p) this.L$0;
                kotlin.a.a(obj);
                pVar2 = pVar3;
                gut gutVar3 = this.this$0;
                this.L$0 = pVar2;
                this.L$1 = ref$ObjectRef3;
                this.L$2 = ref$ObjectRef3;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 3;
                gutVar3.getClass();
                k = myc0.k(hqu0.b(), new eut(gutVar3, pVar2, null), this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            j = this.J$0;
            ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
            okhttp3.p pVar4 = (okhttp3.p) this.L$0;
            kotlin.a.a(obj);
            pVar = pVar4;
            ref$ObjectRef2 = ref$ObjectRef4;
            T t2 = obj;
            ref$ObjectRef3.element = t2;
            i3 = i;
            if (i3 < this.this$0.a || ((okhttp3.u) ref$ObjectRef2.element).t()) {
                L l4 = L.a;
                l4.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l4, L.LogType.d, new Object[]{"response=" + ref$ObjectRef2.element});
                }
                vVar = ((okhttp3.u) ref$ObjectRef2.element).h;
                if (vVar != null) {
                    try {
                        InputStream byteStream = vVar.byteStream();
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(byteStream);
                            ro.e(byteStream, null);
                            vVar.close();
                            return decodeStream;
                        } finally {
                        }
                    } finally {
                    }
                }
                return null;
            }
            int i9 = i3 + 1;
            long j2 = this.this$0.b;
            this.L$0 = pVar;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = null;
            this.J$0 = j;
            this.I$0 = i9;
            this.label = 2;
            if (qsl.b(j2, this) != coroutineSingletons) {
                i = i9;
                ref$ObjectRef3 = ref$ObjectRef2;
                pVar2 = pVar;
                gut gutVar32 = this.this$0;
                this.L$0 = pVar2;
                this.L$1 = ref$ObjectRef3;
                this.L$2 = ref$ObjectRef3;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 3;
                gutVar32.getClass();
                k = myc0.k(hqu0.b(), new eut(gutVar32, pVar2, null), this);
                if (k != coroutineSingletons) {
                    pVar = pVar2;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    t2 = k;
                    ref$ObjectRef3.element = t2;
                    i3 = i;
                    if (i3 < this.this$0.a) {
                    }
                    L l42 = L.a;
                    l42.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                    }
                    vVar = ((okhttp3.u) ref$ObjectRef2.element).h;
                    if (vVar != null) {
                    }
                    return null;
                }
            }
            return coroutineSingletons;
        }
        i3 = this.I$0;
        j = this.J$0;
        ref$ObjectRef = (Ref$ObjectRef) this.L$2;
        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.L$1;
        okhttp3.p pVar5 = (okhttp3.p) this.L$0;
        kotlin.a.a(obj);
        pVar = pVar5;
        ref$ObjectRef2 = ref$ObjectRef5;
        t = obj;
        ref$ObjectRef.element = t;
        if (i3 < this.this$0.a) {
        }
        L l422 = L.a;
        l422.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
        }
        vVar = ((okhttp3.u) ref$ObjectRef2.element).h;
        if (vVar != null) {
        }
        return null;
    }
}
