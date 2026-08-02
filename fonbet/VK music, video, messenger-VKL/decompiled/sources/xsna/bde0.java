package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishMarkersUseCase.kt */
@b6l(c = "com.vk.geo.impl.presentation.publish.PublishMarkersUseCase$prefetchIconUrls$2", f = "PublishMarkersUseCase.kt", l = {236, PsExtractor.VIDEO_STREAM_MASK, 248}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class bde0 extends SuspendLambda implements wzs<yvj, spj<? super zk3<do00, List<? extends Pair<? extends String, ? extends VisibleStyle>>>>, Object> {
    final /* synthetic */ Map<StringId, akt> $clusters;
    final /* synthetic */ zk3<StringId, VisibleStyle> $styles;
    final /* synthetic */ Set<do00> $updates;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ xce0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bde0(Set<do00> set, zk3<StringId, VisibleStyle> zk3Var, Map<StringId, akt> map, xce0 xce0Var, spj<? super bde0> spjVar) {
        super(2, spjVar);
        this.$updates = set;
        this.$styles = zk3Var;
        this.$clusters = map;
        this.this$0 = xce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        bde0 bde0Var = new bde0(this.$updates, this.$styles, this.$clusters, this.this$0, spjVar);
        bde0Var.L$0 = obj;
        return bde0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super zk3<do00, List<? extends Pair<? extends String, ? extends VisibleStyle>>>> spjVar) {
        return ((bde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        r11 = r11.b;
        r12 = r21.$clusters.get(new com.vk.geo.impl.model.id.StringId(r10));
        r13 = r21.this$0;
        r13 = r21.$styles;
        r21.L$0 = r1;
        r21.L$1 = r14;
        r21.L$2 = r15;
        r21.L$3 = r3;
        r21.L$4 = r8;
        r21.L$5 = r9;
        r21.L$6 = r10;
        r21.L$7 = r12;
        r21.I$0 = r11;
        r21.label = r6;
        r13.getClass();
        r17 = r8;
        r8 = xsna.zvj.d(new xsna.ade0(r9, r13, r11, r12, r13, r14, r15, null), r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f7, code lost:
    
        if (r8 != r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        r10 = r9;
        r13 = r12;
        r9 = r10;
        r12 = r3;
        r3 = r11;
        r11 = r17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x014b -> B:12:0x0155). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ui50 ui50Var;
        zk3 zk3Var;
        ArrayList arrayList;
        Iterator<do00> it;
        Object d;
        int i;
        do00 do00Var;
        Iterator<do00> it2;
        String str;
        zrl zrlVar;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.a.a(obj);
            wi50 a = bay.a();
            ui50Var = a;
            zk3Var = new zk3();
            arrayList = new ArrayList(this.$updates.size() * 2);
            it = this.$updates.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            int i4 = this.I$0;
            akt aktVar = (akt) this.L$7;
            String str2 = (String) this.L$6;
            do00 do00Var2 = (do00) this.L$5;
            Iterator<do00> it3 = (Iterator) this.L$4;
            ArrayList arrayList2 = (ArrayList) this.L$3;
            zk3 zk3Var2 = (zk3) this.L$2;
            ui50Var = (ui50) this.L$1;
            kotlin.a.a(obj);
            zk3Var = zk3Var2;
            akt aktVar2 = aktVar;
            Object obj2 = obj;
            zrl zrlVar2 = (zrl) obj2;
            if (zrlVar2 != null) {
                arrayList2.add(zrlVar2);
            }
            xce0 xce0Var = this.this$0;
            int R = VisibleStyle.R(i4);
            zk3<StringId, VisibleStyle> zk3Var3 = this.$styles;
            this.L$0 = yvjVar;
            this.L$1 = ui50Var;
            this.L$2 = zk3Var;
            this.L$3 = arrayList2;
            this.L$4 = it3;
            this.L$5 = do00Var2;
            this.L$6 = str2;
            this.L$7 = null;
            this.I$0 = i4;
            this.label = 2;
            xce0Var.getClass();
            String str3 = str2;
            ui50 ui50Var2 = ui50Var;
            ArrayList arrayList3 = arrayList2;
            zk3 zk3Var4 = zk3Var;
            Iterator<do00> it4 = it3;
            d = zvj.d(new ade0(do00Var2, xce0Var, R, aktVar2, zk3Var3, ui50Var2, zk3Var4, null), this);
            if (d != coroutineSingletons) {
                i = i4;
                arrayList = arrayList3;
                do00Var = do00Var2;
                ui50Var = ui50Var2;
                zk3Var = zk3Var4;
                it2 = it4;
                str = str3;
                zrlVar = (zrl) d;
                if (zrlVar != null) {
                }
                if (this.this$0.e.c(i, str) == null) {
                }
                it = it2;
                i3 = 1;
                while (true) {
                    if (it.hasNext()) {
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zk3 zk3Var5 = (zk3) this.L$2;
            kotlin.a.a(obj);
            return zk3Var5;
        }
        int i5 = this.I$0;
        str = (String) this.L$6;
        do00 do00Var3 = (do00) this.L$5;
        it2 = (Iterator) this.L$4;
        ArrayList arrayList4 = (ArrayList) this.L$3;
        zk3 zk3Var6 = (zk3) this.L$2;
        ui50 ui50Var3 = (ui50) this.L$1;
        kotlin.a.a(obj);
        i = i5;
        arrayList = arrayList4;
        zk3Var = zk3Var6;
        ui50Var = ui50Var3;
        do00Var = do00Var3;
        d = obj;
        zrlVar = (zrl) d;
        if (zrlVar != null) {
            arrayList.add(zrlVar);
        }
        if (this.this$0.e.c(i, str) == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.w, new Object[]{"prefetch_icon_fail: icon is null " + ((Object) VisibleStyle.K(i)) + " – " + do00Var});
            }
        }
        it = it2;
        i3 = 1;
        while (true) {
            if (it.hasNext()) {
                do00 next = it.next();
                zvj.e(yvjVar);
                String str4 = next.b;
                VisibleStyle a2 = qqm0.a(this.$styles, str4);
                if (a2 != null) {
                    break;
                }
            } else {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = zk3Var;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 3;
                if (fto0.e(arrayList, this) != coroutineSingletons) {
                    return zk3Var;
                }
            }
        }
        return coroutineSingletons;
    }
}
