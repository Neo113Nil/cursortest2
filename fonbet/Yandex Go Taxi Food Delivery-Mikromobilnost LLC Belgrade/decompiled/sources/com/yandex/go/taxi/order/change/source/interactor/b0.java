package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.source.data.ChangeSourceMessageResponse;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.b0y0;
import defpackage.c0y0;
import defpackage.cc9;
import defpackage.d6z;
import defpackage.e821;
import defpackage.fmt;
import defpackage.g2t;
import defpackage.m821;
import defpackage.mo21;
import defpackage.n821;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o821;
import defpackage.p821;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qv10;
import defpackage.r821;
import defpackage.rv0;
import defpackage.tb9;
import defpackage.u3e;
import defpackage.v7j0;
import defpackage.zgc0;
import defpackage.zzs;
import defpackage.zzx0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes14.dex */
public final class b0 {
    public final ru.yandex.taxi.persuggest.domain.g a;
    public final com.yandex.go.taxi.order.change.common.domain.d b;
    public final po21 c;
    public final v7j0 d;
    public final c e;
    public final ru.yandex.taxi.systemrequeirements.location.n f;
    public final com.yandex.go.taxi.order.change.source.data.e g;
    public final e h;
    public final rv0 i;

    public b0(ru.yandex.taxi.persuggest.domain.g gVar, com.yandex.go.taxi.order.change.common.domain.d dVar, po21 po21Var, v7j0 v7j0Var, c cVar, ru.yandex.taxi.systemrequeirements.location.n nVar, com.yandex.go.taxi.order.change.source.data.e eVar, e eVar2, rv0 rv0Var) {
        this.a = gVar;
        this.b = dVar;
        this.c = po21Var;
        this.d = v7j0Var;
        this.e = cVar;
        this.f = nVar;
        this.g = eVar;
        this.h = eVar2;
        this.i = rv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        UpdateSourcePointConfirmationInteractor$prepareUiState$1 updateSourcePointConfirmationInteractor$prepareUiState$1;
        int i;
        u3e u3eVar;
        if (continuationImpl instanceof UpdateSourcePointConfirmationInteractor$prepareUiState$1) {
            updateSourcePointConfirmationInteractor$prepareUiState$1 = (UpdateSourcePointConfirmationInteractor$prepareUiState$1) continuationImpl;
            int i2 = updateSourcePointConfirmationInteractor$prepareUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateSourcePointConfirmationInteractor$prepareUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateSourcePointConfirmationInteractor$prepareUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateSourcePointConfirmationInteractor$prepareUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    updateSourcePointConfirmationInteractor$prepareUiState$1.L$0 = null;
                    updateSourcePointConfirmationInteractor$prepareUiState$1.label = 1;
                    obj = this.g.a(str, updateSourcePointConfirmationInteractor$prepareUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                u3eVar = (u3e) obj;
                if (u3eVar == null) {
                    return new r821(u3eVar.a, u3eVar.b, u3eVar.c, false);
                }
                return null;
            }
        }
        updateSourcePointConfirmationInteractor$prepareUiState$1 = new UpdateSourcePointConfirmationInteractor$prepareUiState$1(this, continuationImpl);
        Object obj2 = updateSourcePointConfirmationInteractor$prepareUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSourcePointConfirmationInteractor$prepareUiState$1.label;
        if (i != 0) {
        }
        u3eVar = (u3e) obj2;
        if (u3eVar == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(5:5|6|7|8|9))|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0273, code lost:
    
        if (r1 != r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        if (r7.d(r8) == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011d, code lost:
    
        r0 = r3;
        r3 = -2147483648(0xffffffff80000000, float:-0.0);
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x042a, code lost:
    
        if (r11.b(r0, r10, r8) == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0487, code lost:
    
        if (r11.b(r1, r4, r8) != r2) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c4, code lost:
    
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x011f: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:129:0x011d */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x031d A[Catch: all -> 0x02c9, CancellationException -> 0x048d, TRY_ENTER, TryCatch #2 {CancellationException -> 0x048d, blocks: (B:17:0x0086, B:18:0x037c, B:22:0x00b5, B:23:0x03ca, B:25:0x00e8, B:27:0x0113, B:29:0x0311, B:32:0x031d, B:33:0x0321, B:40:0x0336, B:42:0x033c, B:43:0x0353, B:48:0x0380, B:51:0x03cd, B:53:0x03d1, B:54:0x03e8, B:56:0x03ee, B:57:0x0405, B:60:0x0327, B:63:0x0140, B:66:0x02b8, B:84:0x02c2, B:69:0x02d9, B:72:0x0304, B:68:0x02cc, B:95:0x028f), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03d1 A[Catch: all -> 0x02c9, CancellationException -> 0x048d, TryCatch #2 {CancellationException -> 0x048d, blocks: (B:17:0x0086, B:18:0x037c, B:22:0x00b5, B:23:0x03ca, B:25:0x00e8, B:27:0x0113, B:29:0x0311, B:32:0x031d, B:33:0x0321, B:40:0x0336, B:42:0x033c, B:43:0x0353, B:48:0x0380, B:51:0x03cd, B:53:0x03d1, B:54:0x03e8, B:56:0x03ee, B:57:0x0405, B:60:0x0327, B:63:0x0140, B:66:0x02b8, B:84:0x02c2, B:69:0x02d9, B:72:0x0304, B:68:0x02cc, B:95:0x028f), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03e8 A[Catch: all -> 0x02c9, CancellationException -> 0x048d, TryCatch #2 {CancellationException -> 0x048d, blocks: (B:17:0x0086, B:18:0x037c, B:22:0x00b5, B:23:0x03ca, B:25:0x00e8, B:27:0x0113, B:29:0x0311, B:32:0x031d, B:33:0x0321, B:40:0x0336, B:42:0x033c, B:43:0x0353, B:48:0x0380, B:51:0x03cd, B:53:0x03d1, B:54:0x03e8, B:56:0x03ee, B:57:0x0405, B:60:0x0327, B:63:0x0140, B:66:0x02b8, B:84:0x02c2, B:69:0x02d9, B:72:0x0304, B:68:0x02cc, B:95:0x028f), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0327 A[Catch: all -> 0x02c9, CancellationException -> 0x048d, TryCatch #2 {CancellationException -> 0x048d, blocks: (B:17:0x0086, B:18:0x037c, B:22:0x00b5, B:23:0x03ca, B:25:0x00e8, B:27:0x0113, B:29:0x0311, B:32:0x031d, B:33:0x0321, B:40:0x0336, B:42:0x033c, B:43:0x0353, B:48:0x0380, B:51:0x03cd, B:53:0x03d1, B:54:0x03e8, B:56:0x03ee, B:57:0x0405, B:60:0x0327, B:63:0x0140, B:66:0x02b8, B:84:0x02c2, B:69:0x02d9, B:72:0x0304, B:68:0x02cc, B:95:0x028f), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.go.taxi.order.change.source.interactor.b0] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [T] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, zzs] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [c6z, com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.yandex.go.taxi.order.models.api.response.OrderChangesDto$Status] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cc9 cc9Var, ContinuationImpl continuationImpl) {
        UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1 updateSourcePointConfirmationInteractor$tryUpdatePickup$1;
        ?? r3;
        cc9 cc9Var2;
        Ref$ObjectRef ref$ObjectRef;
        String str2;
        cc9 cc9Var3;
        Ref$ObjectRef ref$ObjectRef2;
        c0y0 c0y0Var;
        Ref$ObjectRef ref$ObjectRef3;
        String str3;
        Ref$ObjectRef ref$ObjectRef4;
        ChangeSourcePointExperiment changeSourcePointExperiment;
        ChangeSourcePointExperiment changeSourcePointExperiment2;
        zzs zzsVar;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        String str4;
        boolean z;
        ru.yandex.taxi.persuggest.domain.d j;
        Object y;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        String str5;
        ChangeSourcePointExperiment changeSourcePointExperiment3;
        cc9 cc9Var4;
        ChangeSourcePointExperiment changeSourcePointExperiment4;
        cc9 cc9Var5;
        pv0 b;
        Address address;
        Object b2;
        cc9 cc9Var6;
        ChangeSourcePointExperiment changeSourcePointExperiment5;
        Ref$ObjectRef ref$ObjectRef9;
        Ref$ObjectRef ref$ObjectRef10;
        ?? r15;
        int i;
        String str6;
        ?? r0 = this;
        try {
            try {
                if (continuationImpl instanceof UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1) {
                    updateSourcePointConfirmationInteractor$tryUpdatePickup$1 = (UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1) continuationImpl;
                    int i2 = updateSourcePointConfirmationInteractor$tryUpdatePickup$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        updateSourcePointConfirmationInteractor$tryUpdatePickup$1.label = i2 - Integer.MIN_VALUE;
                        UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1 updateSourcePointConfirmationInteractor$tryUpdatePickup$12 = updateSourcePointConfirmationInteractor$tryUpdatePickup$1;
                        Object obj = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        r3 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label;
                        e eVar = r0.h;
                        switch (r3) {
                            case 0:
                                Ref$ObjectRef z2 = qv10.z(obj);
                                z2.element = OrderChangesDto.Status.UNAVAILABLE;
                                ref$ObjectRef = new Ref$ObjectRef();
                                str2 = str;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str2;
                                cc9Var3 = cc9Var;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = z2;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 1;
                                Object b3 = r0.g.a.b(updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                if (b3 != coroutineSingletons) {
                                    ref$ObjectRef2 = z2;
                                    obj = b3;
                                    ChangeSourcePointExperiment changeSourcePointExperiment6 = (ChangeSourcePointExperiment) obj;
                                    c0y0Var = cc9Var3.b;
                                    if (c0y0Var instanceof zzx0) {
                                        ru.yandex.taxi.systemrequeirements.location.n nVar = r0.f;
                                        if (nVar.b()) {
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str2;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var3;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef2;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment6;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 2;
                                            Object d = ((com.yandex.go.permission.b) r0.d).d(1, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                            if (d != coroutineSingletons) {
                                                Ref$ObjectRef ref$ObjectRef11 = ref$ObjectRef;
                                                changeSourcePointExperiment2 = changeSourcePointExperiment6;
                                                obj = d;
                                                str3 = str2;
                                                ref$ObjectRef4 = ref$ObjectRef11;
                                                Ref$ObjectRef ref$ObjectRef12 = ref$ObjectRef2;
                                                cc9Var2 = cc9Var3;
                                                ref$ObjectRef3 = ref$ObjectRef12;
                                                changeSourcePointExperiment = changeSourcePointExperiment2;
                                                if (!((Boolean) obj).booleanValue()) {
                                                    return p821.a;
                                                }
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str3;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef3;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef4;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 4;
                                                obj = ((ru.yandex.taxi.preorder.source.userposition.e) r0.c).f(updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                                changeSourcePointExperiment4 = changeSourcePointExperiment;
                                                break;
                                            }
                                        } else {
                                            if (nVar.c()) {
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str2;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var3;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef2;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment6;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 3;
                                                break;
                                            }
                                            Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef2;
                                            cc9Var2 = cc9Var3;
                                            ref$ObjectRef3 = ref$ObjectRef13;
                                            str3 = str2;
                                            ref$ObjectRef4 = ref$ObjectRef;
                                            changeSourcePointExperiment = changeSourcePointExperiment6;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str3;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef3;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef4;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 4;
                                            obj = ((ru.yandex.taxi.preorder.source.userposition.e) r0.c).f(updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                            changeSourcePointExperiment4 = changeSourcePointExperiment;
                                        }
                                    } else {
                                        zzsVar = ((zzx0) c0y0Var).b;
                                        Ref$ObjectRef ref$ObjectRef14 = ref$ObjectRef;
                                        r3 = changeSourcePointExperiment6;
                                        ref$ObjectRef5 = ref$ObjectRef2;
                                        cc9Var2 = cc9Var3;
                                        ref$ObjectRef6 = ref$ObjectRef14;
                                        str4 = str2;
                                        c0y0 c0y0Var2 = cc9Var2.b;
                                        z = c0y0Var2 instanceof b0y0;
                                        try {
                                            j = r0.a.j(zzsVar, z, !(c0y0Var2 instanceof zzx0) ? null : PositionInitAction.AUTO_LOCATION, false);
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str4;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef5;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef6;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = r3;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = z ? 1 : 0;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 5;
                                            y = kotlinx.coroutines.flow.e.y(j, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                            if (y != coroutineSingletons) {
                                                ref$ObjectRef7 = ref$ObjectRef5;
                                                obj = y;
                                                String str7 = str4;
                                                ref$ObjectRef8 = ref$ObjectRef6;
                                                str5 = str7;
                                                changeSourcePointExperiment3 = r3;
                                                cc9Var4 = cc9Var2;
                                                z = z;
                                                try {
                                                    g2t g2tVar = (g2t) obj;
                                                    b = r0.i.b(g2tVar);
                                                    if (b != null) {
                                                        try {
                                                            address = b.a;
                                                            break;
                                                        } catch (Throwable unused) {
                                                            cc9Var2 = cc9Var4;
                                                            r3 = changeSourcePointExperiment3;
                                                            r0 = z;
                                                            o2y0 o2y0Var = cc9Var2.a;
                                                            ChangeOrderState$Failure changeOrderState$Failure = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(r3, r3.e.a), d6z.Y(r3, r3.e.b), (ChangeOrderNotificationActionResponse) null, 9));
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$10 = null;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r0;
                                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 10;
                                                            break;
                                                        }
                                                    }
                                                    zgc0 zgc0Var = PlainAddress.Companion;
                                                    zzs zzsVar2 = g2tVar.b.a;
                                                    zgc0Var.getClass();
                                                    address = zgc0.a(zzsVar2);
                                                    c cVar = r0.e;
                                                    String str8 = cc9Var4.a.b().a;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var4;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef7;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef8;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment3;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = z ? 1 : 0;
                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 6;
                                                    Ref$ObjectRef ref$ObjectRef15 = ref$ObjectRef7;
                                                    cc9Var5 = cc9Var4;
                                                    try {
                                                        b2 = cVar.b(str5, str8, address, SourceChangeReason.PICKUP_POINT_MANUAL, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                                        if (b2 != coroutineSingletons) {
                                                            cc9Var6 = cc9Var5;
                                                            obj = b2;
                                                            changeSourcePointExperiment5 = changeSourcePointExperiment3;
                                                            ref$ObjectRef9 = ref$ObjectRef15;
                                                            ref$ObjectRef10 = ref$ObjectRef8;
                                                            r15 = z;
                                                            ConfirmChangeResponse confirmChangeResponse = (ConfirmChangeResponse) ((fmt) obj).a;
                                                            OrderChangesDto.Status status = confirmChangeResponse.b;
                                                            ChangeSourceMessageResponse changeSourceMessageResponse = confirmChangeResponse.d;
                                                            ref$ObjectRef9.element = status != null ? OrderChangesDto.Status.UNAVAILABLE : status;
                                                            i = status != null ? -1 : e821.a[status.ordinal()];
                                                            if (i != 1 || i == 2) {
                                                                str6 = confirmChangeResponse.a;
                                                                if (str6 != null) {
                                                                    o2y0 o2y0Var2 = cc9Var6.a;
                                                                    ChangeOrderState$Failure changeOrderState$Failure2 = new ChangeOrderState$Failure(str6, ChangeOrderState$Source.SOURCE_POINT, changeSourceMessageResponse != null ? new OrderChangesDto.Notification((String) null, changeSourceMessageResponse.a, changeSourceMessageResponse.b, ChangeOrderNotificationActionResponse.COMMUNICATE_WITH_DRIVER, 1) : null);
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var6;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef9;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef10;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment5;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$10 = null;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r15;
                                                                    updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 7;
                                                                    break;
                                                                } else {
                                                                    r0.b.a.h(new tb9(cc9Var6.a.b().a, str6, ChangeOrderState$Source.SOURCE_POINT));
                                                                }
                                                                return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                                                            }
                                                            if (i != 3) {
                                                                o2y0 o2y0Var3 = cc9Var6.a;
                                                                ChangeOrderState$Unavailable changeOrderState$Unavailable = new ChangeOrderState$Unavailable(ChangeOrderState$Source.SOURCE_POINT, changeSourceMessageResponse != null ? new OrderChangesDto.Notification((String) null, changeSourceMessageResponse.a, changeSourceMessageResponse.b, (ChangeOrderNotificationActionResponse) null, 9) : null);
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var6;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef9;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef10;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment5;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r15;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 9;
                                                                obj = eVar.b(o2y0Var3, changeOrderState$Unavailable, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                                                if (obj != coroutineSingletons) {
                                                                    return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                                                                }
                                                            } else {
                                                                o2y0 o2y0Var4 = cc9Var6.a;
                                                                ChangeOrderState$Failure changeOrderState$Failure3 = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(changeSourcePointExperiment5, changeSourcePointExperiment5.g.a), d6z.Y(changeSourcePointExperiment5, changeSourcePointExperiment5.g.b), (ChangeOrderNotificationActionResponse) null, 9));
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var6;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef9;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef10;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment5;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r15;
                                                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 8;
                                                                obj = eVar.b(o2y0Var4, changeOrderState$Failure3, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                                                if (obj != coroutineSingletons) {
                                                                    return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable unused2) {
                                                        cc9Var2 = cc9Var5;
                                                        r3 = changeSourcePointExperiment3;
                                                        r0 = z;
                                                        o2y0 o2y0Var5 = cc9Var2.a;
                                                        ChangeOrderState$Failure changeOrderState$Failure4 = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(r3, r3.e.a), d6z.Y(r3, r3.e.b), (ChangeOrderNotificationActionResponse) null, 9));
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$10 = null;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r0;
                                                        updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 10;
                                                    }
                                                } catch (Throwable unused3) {
                                                    cc9Var5 = cc9Var4;
                                                }
                                            }
                                        } catch (Throwable unused4) {
                                            r0 = z;
                                            o2y0 o2y0Var52 = cc9Var2.a;
                                            ChangeOrderState$Failure changeOrderState$Failure42 = new ChangeOrderState$Failure(null, ChangeOrderState$Source.SOURCE_POINT, new OrderChangesDto.Notification((String) null, d6z.Y(r3, r3.e.a), d6z.Y(r3, r3.e.b), (ChangeOrderNotificationActionResponse) null, 9));
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$9 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$10 = null;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = r0;
                                            updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 10;
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            case 1:
                                ref$ObjectRef = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                Ref$ObjectRef ref$ObjectRef16 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9Var3 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                String str9 = (String) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0;
                                kotlin.b.b(obj);
                                ref$ObjectRef2 = ref$ObjectRef16;
                                str2 = str9;
                                ChangeSourcePointExperiment changeSourcePointExperiment62 = (ChangeSourcePointExperiment) obj;
                                c0y0Var = cc9Var3.b;
                                if (c0y0Var instanceof zzx0) {
                                }
                                break;
                            case 2:
                                ChangeSourcePointExperiment changeSourcePointExperiment7 = (ChangeSourcePointExperiment) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4;
                                ref$ObjectRef4 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef3 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9Var2 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                str3 = (String) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0;
                                kotlin.b.b(obj);
                                changeSourcePointExperiment2 = changeSourcePointExperiment7;
                                changeSourcePointExperiment = changeSourcePointExperiment2;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef4;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 4;
                                obj = ((ru.yandex.taxi.preorder.source.userposition.e) r0.c).f(updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                changeSourcePointExperiment4 = changeSourcePointExperiment;
                                break;
                            case 3:
                                ChangeSourcePointExperiment changeSourcePointExperiment8 = (ChangeSourcePointExperiment) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4;
                                ref$ObjectRef4 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef3 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9Var2 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                str3 = (String) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0;
                                kotlin.b.b(obj);
                                changeSourcePointExperiment = changeSourcePointExperiment8;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef4;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 4;
                                obj = ((ru.yandex.taxi.preorder.source.userposition.e) r0.c).f(updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                changeSourcePointExperiment4 = changeSourcePointExperiment;
                                break;
                            case 4:
                                ChangeSourcePointExperiment changeSourcePointExperiment9 = (ChangeSourcePointExperiment) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4;
                                ref$ObjectRef4 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef3 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9Var2 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                str3 = (String) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0;
                                kotlin.b.b(obj);
                                changeSourcePointExperiment4 = changeSourcePointExperiment9;
                                ?? a = ((mo21) obj).a();
                                ref$ObjectRef4.element = a;
                                str4 = str3;
                                zzsVar = a;
                                ref$ObjectRef5 = ref$ObjectRef3;
                                ref$ObjectRef6 = ref$ObjectRef4;
                                r3 = changeSourcePointExperiment4;
                                c0y0 c0y0Var22 = cc9Var2.b;
                                z = c0y0Var22 instanceof b0y0;
                                j = r0.a.j(zzsVar, z, !(c0y0Var22 instanceof zzx0) ? null : PositionInitAction.AUTO_LOCATION, false);
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = str4;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var2;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef5;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef6;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = r3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = z ? 1 : 0;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 5;
                                y = kotlinx.coroutines.flow.e.y(j, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                if (y != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            case 5:
                                ?? r32 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0;
                                ChangeSourcePointExperiment changeSourcePointExperiment10 = (ChangeSourcePointExperiment) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4;
                                Ref$ObjectRef ref$ObjectRef17 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                Ref$ObjectRef ref$ObjectRef18 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9 cc9Var7 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                String str10 = (String) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0;
                                kotlin.b.b(obj);
                                ref$ObjectRef8 = ref$ObjectRef17;
                                str5 = str10;
                                z = r32;
                                changeSourcePointExperiment3 = changeSourcePointExperiment10;
                                ref$ObjectRef7 = ref$ObjectRef18;
                                cc9Var4 = cc9Var7;
                                g2t g2tVar2 = (g2t) obj;
                                b = r0.i.b(g2tVar2);
                                if (b != null) {
                                }
                                zgc0 zgc0Var2 = PlainAddress.Companion;
                                zzs zzsVar22 = g2tVar2.b.a;
                                zgc0Var2.getClass();
                                address = zgc0.a(zzsVar22);
                                c cVar2 = r0.e;
                                String str82 = cc9Var4.a.b().a;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$0 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1 = cc9Var4;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2 = ref$ObjectRef7;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3 = ref$ObjectRef8;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4 = changeSourcePointExperiment3;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$5 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$6 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$7 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$8 = null;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0 = z ? 1 : 0;
                                updateSourcePointConfirmationInteractor$tryUpdatePickup$12.label = 6;
                                Ref$ObjectRef ref$ObjectRef152 = ref$ObjectRef7;
                                cc9Var5 = cc9Var4;
                                b2 = cVar2.b(str5, str82, address, SourceChangeReason.PICKUP_POINT_MANUAL, updateSourcePointConfirmationInteractor$tryUpdatePickup$12);
                                if (b2 != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            case 6:
                                int i3 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0;
                                ChangeSourcePointExperiment changeSourcePointExperiment11 = (ChangeSourcePointExperiment) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$4;
                                Ref$ObjectRef ref$ObjectRef19 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                Ref$ObjectRef ref$ObjectRef20 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                cc9 cc9Var8 = (cc9) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$1;
                                kotlin.b.b(obj);
                                r15 = i3;
                                changeSourcePointExperiment5 = changeSourcePointExperiment11;
                                ref$ObjectRef10 = ref$ObjectRef19;
                                ref$ObjectRef9 = ref$ObjectRef20;
                                cc9Var6 = cc9Var8;
                                ConfirmChangeResponse confirmChangeResponse2 = (ConfirmChangeResponse) ((fmt) obj).a;
                                OrderChangesDto.Status status2 = confirmChangeResponse2.b;
                                ChangeSourceMessageResponse changeSourceMessageResponse2 = confirmChangeResponse2.d;
                                ref$ObjectRef9.element = status2 != null ? OrderChangesDto.Status.UNAVAILABLE : status2;
                                if (status2 != null) {
                                }
                                if (i != 1) {
                                }
                                str6 = confirmChangeResponse2.a;
                                if (str6 != null) {
                                }
                                return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                            case 7:
                                int i4 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0;
                                ref$ObjectRef10 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef9 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                kotlin.b.b(obj);
                                return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                            case 8:
                                int i5 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0;
                                ref$ObjectRef10 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef9 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                kotlin.b.b(obj);
                                return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                            case 9:
                                int i6 = updateSourcePointConfirmationInteractor$tryUpdatePickup$12.I$0;
                                ref$ObjectRef10 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$3;
                                ref$ObjectRef9 = (Ref$ObjectRef) updateSourcePointConfirmationInteractor$tryUpdatePickup$12.L$2;
                                kotlin.b.b(obj);
                                return new n821((OrderChangesDto.Status) ref$ObjectRef9.element, (zzs) ref$ObjectRef10.element);
                            case 10:
                                kotlin.b.b(obj);
                                return m821.a;
                            default:
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (r3) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused5) {
            return o821.a;
        }
        updateSourcePointConfirmationInteractor$tryUpdatePickup$1 = new UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1(r0, continuationImpl);
        UpdateSourcePointConfirmationInteractor$tryUpdatePickup$1 updateSourcePointConfirmationInteractor$tryUpdatePickup$122 = updateSourcePointConfirmationInteractor$tryUpdatePickup$1;
        Object obj2 = updateSourcePointConfirmationInteractor$tryUpdatePickup$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r3 = updateSourcePointConfirmationInteractor$tryUpdatePickup$122.label;
        e eVar2 = r0.h;
    }
}
