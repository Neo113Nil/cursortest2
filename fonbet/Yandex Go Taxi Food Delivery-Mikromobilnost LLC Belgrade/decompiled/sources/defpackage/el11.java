package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Toast;
import androidx.camera.video.i;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.android.gms.tasks.Task;
import com.yandex.go.payments.cards.data.l;
import com.yandex.go.payments.cards.data.o;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import com.yandex.messaging.internal.authorized.h;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;
import com.ybsdk.screens.upgrade.domain.mapper.SecondDocumentHelperTextMapper$SecondDocumentDisplayType;
import com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditViewState$StepChange;
import com.ybsdk.widgets.common.ErrorView$State$PrimaryButtonGravity;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.WidgetView$State$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.VerticalInternalTariffView;
import ru.yandex.taxi.preorder.summary.selector.verticals.VerticalsWithBackgroundView;
import ru.yandex.taxi.search.view.a;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.YandexPlayerImpl;
import ru.yandex.video.m3.player.provider.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class el11 implements l921, ev31, v0x0, pj21, pke, uf41, dvu, aee0, xv51, el7, VideoSink, jw31, wx60, uu60, dx4, gjf0, Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ el11(i iVar, dyq0 dyq0Var) {
        this.a = 14;
        this.b = dyq0Var;
    }

    @Override // defpackage.xv51
    public void b() {
        d dVar = (d) this.b;
        if (dVar.E0.d() instanceof jw51) {
            dVar.F0.a();
        }
    }

    @Override // defpackage.aee0
    public oeq0 c(int i) {
        oeq0 _init_$lambda$4;
        oeq0 lambda$0$0$0;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 11:
                _init_$lambda$4 = VerticalInternalTariffView._init_$lambda$4((VerticalInternalTariffView) obj, i);
                return _init_$lambda$4;
            default:
                lambda$0$0$0 = VerticalsWithBackgroundView.lambda$0$0$0((VerticalsWithBackgroundView) obj, i);
                return lambda$0$0$0;
        }
    }

    @Override // defpackage.uu60
    public boolean d() {
        return ((Boolean) ((yv41) this.b).a.p.getValue()).booleanValue();
    }

    @Override // defpackage.v0x0
    public Object execute() {
        SQLiteDatabase a;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                b bVar = (b) ((ugo) obj);
                long time = bVar.b.getTime() - bVar.w.d;
                a = bVar.a();
                a.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            bVar.k(cursor.getInt(0), LogEventDropped$Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = a.delete("events", "timestamp_ms < ?", strArr);
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
            default:
                ofa0 ofa0Var = (ofa0) obj;
                a = ((b) ((ugo) ofa0Var.b)).a();
                a.beginTransaction();
                try {
                    List list = (List) b.v(a.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new yci0());
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((am2) ofa0Var.c).o((v111) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // defpackage.gjf0
    public void f(long j, long j2) {
        gk51 gk51Var = (gk51) this.b;
        gk51Var.x.b(j, j2, gk51Var.a.c);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get */
    public Object getValue() {
        PlayerDelegate decoderManager$lambda$2;
        decoderManager$lambda$2 = YandexPlayerImpl.decoderManager$lambda$2((YandexPlayerImpl) this.b);
        return decoderManager$lambda$2;
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // defpackage.jw31
    public boolean i(View view) {
        for (Class cls : (Class[]) this.b) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        dyq0 dyq0Var = (dyq0) this.b;
        dyq0Var.b.g.a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(bVar.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        zk31 zk31Var = new zk31(atomicBoolean, bVar, dyq0Var);
        bVar.a(new hpo0(20, atomicBoolean, dyq0Var, zk31Var), geb1.b());
        dyq0Var.b.b(zk31Var);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(bVar.hashCode()));
    }

    @Override // defpackage.dvu
    public void k(long j, m831 m831Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 9:
                ((l) obj).d.e(m831Var);
                break;
            default:
                ((o) obj).d.e(m831Var);
                break;
        }
    }

    @Override // defpackage.pj21
    public void m() {
        Toast.makeText(((h) this.b).a, oyh0.restricted_with_spam_text, 0).show();
    }

    @Override // defpackage.dx4
    public void o(a aVar, pv0 pv0Var) {
        ((da0) this.b).r(new t71(pv0Var, 22));
    }

    @Override // defpackage.uf41
    public void onClose() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 8:
                ((com.yandex.go.vault.router.d) obj).r(new qu(i2));
                break;
            case 19:
                gg41 gg41Var = (gg41) obj;
                if (gg41Var.u()) {
                    gg41Var.r(new qu(i2));
                    break;
                }
                break;
            default:
                ((yue) ((kt41) obj).a.b).run();
                break;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 18:
                l8a1.d((Intent) obj);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        ((VideoSource) this.b).lambda$setVideoProcessor$1(videoFrame);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03a4, code lost:
    
        if (r4 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03a7, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03f4, code lost:
    
        if (r4 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0416, code lost:
    
        if (r4 == null) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f6 A[PHI: r14
      0x03f6: PHI (r14v15 bes0) = (r14v14 bes0), (r14v14 bes0), (r14v14 bes0), (r14v19 bes0), (r14v14 bes0), (r14v20 bes0), (r14v21 bes0), (r14v14 bes0) binds: [B:131:0x038f, B:151:0x03f4, B:142:0x03b8, B:147:0x03da, B:146:0x03d7, B:140:0x03af, B:137:0x03a7, B:136:0x03a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.List] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        List list;
        List list2;
        Pair pair;
        List list3;
        int i;
        SimpleIdFormFieldEntity simpleIdFormFieldEntity;
        UpgradeEditViewState$StepChange upgradeEditViewState$StepChange;
        sb21 sb21Var;
        EmptyList emptyList;
        hfb1 hfb1Var;
        Text.Resource resource;
        Text resource2;
        Text plural;
        Text text;
        Text.Resource resource3;
        LoadableInput.LoadingState loadingState;
        bes0 e;
        List list4;
        d451 d451Var;
        List list5;
        vfs0 vfs0Var;
        d451 d451Var2;
        ja21 ja21Var;
        u8j0 u8j0Var;
        Text.Resource resource4;
        LoadableInput.LoadingState loadingState2;
        String str;
        ov41 ov41Var;
        int i2 = this.a;
        qb21 qb21Var = qb21.a;
        pb21 pb21Var = pb21.a;
        ob21 ob21Var = ob21.a;
        Object obj2 = this.b;
        boolean z = false;
        boolean z2 = true;
        switch (i2) {
            case 3:
                ba21 ba21Var = (ba21) obj2;
                z921 z921Var = (z921) obj;
                des0 des0Var = ba21Var.a;
                ja21 ja21Var2 = z921Var.b;
                SimpleIdFormFieldEntity simpleIdFormFieldEntity2 = z921Var.a;
                String b = ja21Var2.b(simpleIdFormFieldEntity2);
                UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType = ja21Var2.h;
                SimpleIdFormFieldEntity.Companion.getClass();
                list = SimpleIdFormFieldEntity.sorted;
                int indexOf = list.indexOf(simpleIdFormFieldEntity2) + 1;
                int i3 = dzh0.ybsdk_uprid_uprid_editor_progress_title;
                Text.Formatted.Arg.Companion.getClass();
                Text.Formatted formatted = new Text.Formatted(i3, scc.g(new Text.Formatted.Arg.IntArg(indexOf), new Text.Formatted.Arg.IntArg(6)));
                Text.Join join = new Text.Join(scc.g(new Text.Resource(dzh0.ybsdk_uprid_accessibility_form_progress_title), formatted), " ");
                list2 = SimpleIdFormFieldEntity.sorted;
                Triple triple = new Triple(Integer.valueOf(m810.b(100.0f / list2.size()) * indexOf), formatted, join);
                int intValue = ((Number) triple.getFirst()).intValue();
                Text text2 = (Text) triple.getSecond();
                Text text3 = (Text) triple.getThird();
                int[] iArr = aa21.a;
                int i4 = iArr[simpleIdFormFieldEntity2.ordinal()];
                EmptyList emptyList2 = EmptyList.a;
                switch (i4) {
                    case 1:
                    case 2:
                    case 3:
                        pair = new Pair(Boolean.FALSE, emptyList2);
                        boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                        List list6 = (List) pair.getSecond();
                        list3 = SimpleIdFormFieldEntity.sorted;
                        boolean z3 = simpleIdFormFieldEntity2 == kotlin.collections.a.P(list3);
                        String a = des0Var.a(simpleIdFormFieldEntity2, b);
                        i = iArr[simpleIdFormFieldEntity2.ordinal()];
                        bes0 bes0Var = aes0.a;
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                                e = des0Var.e(simpleIdFormFieldEntity2, a);
                                if (a.length() <= 0) {
                                    e = null;
                                    break;
                                }
                                break;
                            case 4:
                                if (a.length() >= 10) {
                                    bes0Var = des0Var.d(a);
                                } else if (a.length() != 0) {
                                    d6w d6wVar = new d6w(0, 3, 1);
                                    Integer e2 = sza.e(gvu0.u0(a));
                                    if (e2 == null || !d6wVar.g(e2.intValue())) {
                                        bes0Var = new zds0(unr0.h(Text.Companion, dzh0.ybsdk_uprid_notValid_error_title));
                                    }
                                }
                                simpleIdFormFieldEntity = ba21Var.d;
                                if (simpleIdFormFieldEntity != null) {
                                    if (simpleIdFormFieldEntity2.getOrder() <= simpleIdFormFieldEntity.getOrder()) {
                                        if (simpleIdFormFieldEntity2.getOrder() >= simpleIdFormFieldEntity.getOrder()) {
                                            upgradeEditViewState$StepChange = UpgradeEditViewState$StepChange.NONE;
                                            break;
                                        } else {
                                            upgradeEditViewState$StepChange = UpgradeEditViewState$StepChange.BACKWARD;
                                            break;
                                        }
                                    } else {
                                        upgradeEditViewState$StepChange = UpgradeEditViewState$StepChange.FORWARD;
                                        break;
                                    }
                                }
                                upgradeEditViewState$StepChange = UpgradeEditViewState$StepChange.NONE;
                                UpgradeEditViewState$StepChange upgradeEditViewState$StepChange2 = upgradeEditViewState$StepChange;
                                ba21Var.d = simpleIdFormFieldEntity2;
                                sb21Var = z921Var.c;
                                if (simpleIdFormFieldEntity2 != SimpleIdFormFieldEntity.INN_OR_SNILS) {
                                    sb21Var = null;
                                }
                                if (sb21Var == null) {
                                    sb21Var = ob21Var;
                                }
                                boolean z4 = sb21Var instanceof rb21;
                                rb21 rb21Var = !z4 ? (rb21) sb21Var : null;
                                emptyList = rb21Var == null ? rb21Var.a : null;
                                if (emptyList != null) {
                                    emptyList2 = emptyList;
                                }
                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                        hfb1Var = eyy.c;
                                        hfb1 hfb1Var2 = hfb1Var;
                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                            case 1:
                                                resource = new Text.Resource(dzh0.ybsdk_uprid_first_name_title);
                                                Text.Resource resource5 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                    case 1:
                                                        resource2 = new Text.Resource(dzh0.ybsdk_uprid_name_tip_title);
                                                        plural = resource2;
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 6:
                                                                text = Text.Empty.INSTANCE;
                                                                Text text4 = text;
                                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                        resource3 = new Text.Resource(dzh0.ybsdk_uprid_button_next);
                                                                        Text.Resource resource6 = resource3;
                                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                                            case 1:
                                                                            case 2:
                                                                            case 3:
                                                                            case 4:
                                                                            case 5:
                                                                                loadingState = LoadableInput.LoadingState.DEFAULT;
                                                                                LoadableInput.LoadingState loadingState3 = loadingState;
                                                                                boolean z5 = !emptyList2.contains(b);
                                                                                boolean z6 = !(bes0Var instanceof aes0);
                                                                                zds0 zds0Var = !(bes0Var instanceof zds0) ? (zds0) bes0Var : null;
                                                                                return new ea21(hfb1Var2, b, loadingState3, resource5, plural, text4, emptyList2, z5, intValue, text2, text3, booleanValue, list6, z3, resource6, z6, zds0Var == null ? zds0Var.a : null, upgradeEditViewState$StepChange2);
                                                                            case 6:
                                                                                if (sb21Var.equals(ob21Var)) {
                                                                                    loadingState = LoadableInput.LoadingState.DEFAULT;
                                                                                } else if (sb21Var.equals(pb21Var)) {
                                                                                    loadingState = LoadableInput.LoadingState.DEFAULT;
                                                                                } else if (sb21Var.equals(qb21Var)) {
                                                                                    loadingState = LoadableInput.LoadingState.LOADING;
                                                                                } else {
                                                                                    if (!z4) {
                                                                                        w511.b();
                                                                                        return null;
                                                                                    }
                                                                                    loadingState = ((rb21) sb21Var).a.contains(b) ? LoadableInput.LoadingState.SUCCESS : LoadableInput.LoadingState.DEFAULT;
                                                                                }
                                                                                LoadableInput.LoadingState loadingState32 = loadingState;
                                                                                boolean z52 = !emptyList2.contains(b);
                                                                                boolean z62 = !(bes0Var instanceof aes0);
                                                                                if (!(bes0Var instanceof zds0)) {
                                                                                }
                                                                                return new ea21(hfb1Var2, b, loadingState32, resource5, plural, text4, emptyList2, z52, intValue, text2, text3, booleanValue, list6, z3, resource6, z62, zds0Var == null ? zds0Var.a : null, upgradeEditViewState$StepChange2);
                                                                            default:
                                                                                w511.b();
                                                                                return null;
                                                                        }
                                                                    case 6:
                                                                        resource3 = new Text.Resource(dzh0.ybsdk_uprid_button_done);
                                                                        Text.Resource resource62 = resource3;
                                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                                        }
                                                                    default:
                                                                        w511.b();
                                                                        return null;
                                                                }
                                                            case 4:
                                                                text = new Text.Resource(dzh0.ybsdk_uprid_birth_date_placeholder);
                                                                Text text42 = text;
                                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                                }
                                                            case 5:
                                                                text = new Text.Resource(dzh0.ybsdk_uprid_passport_placeholder);
                                                                Text text422 = text;
                                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                                }
                                                            default:
                                                                w511.b();
                                                                return null;
                                                        }
                                                    case 2:
                                                        resource2 = new Text.Resource(dzh0.ybsdk_uprid_name_tip_title);
                                                        plural = resource2;
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                        }
                                                    case 3:
                                                        resource2 = new Text.Resource(dzh0.ybsdk_uprid_middle_name_tip_title);
                                                        plural = resource2;
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                        }
                                                    case 4:
                                                        plural = new Text.Plural(gwh0.ybsdk_uprid_birthdate_tip_title, ba21Var.b.getMinAge());
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                        }
                                                    case 5:
                                                        resource2 = new Text.Resource(dzh0.ybsdk_uprid_upgrade_passport_helper);
                                                        plural = resource2;
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                        }
                                                    case 6:
                                                        resource2 = ba21Var.c.a(b, sb21Var, upgradeFormEntity$SecondDocumentType, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.EDIT);
                                                        plural = resource2;
                                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                        }
                                                    default:
                                                        w511.b();
                                                        return null;
                                                }
                                            case 2:
                                                resource = new Text.Resource(dzh0.ybsdk_uprid_last_name_title);
                                                Text.Resource resource52 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                }
                                            case 3:
                                                resource = new Text.Resource(dzh0.ybsdk_uprid_middle_name_title);
                                                Text.Resource resource522 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                }
                                            case 4:
                                                resource = new Text.Resource(dzh0.ybsdk_uprid_birth_date_title);
                                                Text.Resource resource5222 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                }
                                            case 5:
                                                resource = new Text.Resource(dzh0.ybsdk_uprid_passport_title);
                                                Text.Resource resource52222 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                }
                                            case 6:
                                                resource = upgradeFormEntity$SecondDocumentType == UpgradeFormEntity$SecondDocumentType.SNILS ? new Text.Resource(dzh0.ybsdk_uprid_insurance_account_id_title) : upgradeFormEntity$SecondDocumentType == UpgradeFormEntity$SecondDocumentType.INN ? new Text.Resource(dzh0.ybsdk_uprid_taxes_id_title) : des0.c(b) ? new Text.Resource(dzh0.ybsdk_uprid_insurance_account_id_title) : des0.b(b) ? new Text.Resource(dzh0.ybsdk_uprid_taxes_id_title) : new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_title);
                                                Text.Resource resource522222 = resource;
                                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                                }
                                            default:
                                                w511.b();
                                                return null;
                                        }
                                    case 4:
                                        hfb1Var = yxy.a;
                                        hfb1 hfb1Var22 = hfb1Var;
                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                        }
                                    case 5:
                                    case 6:
                                        hfb1Var = byy.a;
                                        hfb1 hfb1Var222 = hfb1Var;
                                        switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                        }
                                    default:
                                        w511.b();
                                        return null;
                                }
                            case 5:
                                simpleIdFormFieldEntity = ba21Var.d;
                                if (simpleIdFormFieldEntity != null) {
                                }
                                upgradeEditViewState$StepChange = UpgradeEditViewState$StepChange.NONE;
                                UpgradeEditViewState$StepChange upgradeEditViewState$StepChange22 = upgradeEditViewState$StepChange;
                                ba21Var.d = simpleIdFormFieldEntity2;
                                sb21Var = z921Var.c;
                                if (simpleIdFormFieldEntity2 != SimpleIdFormFieldEntity.INN_OR_SNILS) {
                                }
                                if (sb21Var == null) {
                                }
                                boolean z42 = sb21Var instanceof rb21;
                                if (!z42) {
                                }
                                if (rb21Var == null) {
                                }
                                if (emptyList != null) {
                                }
                                switch (iArr[simpleIdFormFieldEntity2.ordinal()]) {
                                }
                            case 6:
                                e = des0Var.e(simpleIdFormFieldEntity2, a);
                                if (a.length() != 12) {
                                    e = null;
                                    break;
                                }
                                break;
                            default:
                                w511.b();
                                return null;
                        }
                    case 4:
                        pair = new Pair(Boolean.TRUE, bpu.a);
                        boolean booleanValue2 = ((Boolean) pair.getFirst()).booleanValue();
                        List list62 = (List) pair.getSecond();
                        list3 = SimpleIdFormFieldEntity.sorted;
                        if (simpleIdFormFieldEntity2 == kotlin.collections.a.P(list3)) {
                        }
                        String a2 = des0Var.a(simpleIdFormFieldEntity2, b);
                        i = iArr[simpleIdFormFieldEntity2.ordinal()];
                        bes0 bes0Var2 = aes0.a;
                        switch (i) {
                        }
                    case 5:
                        pair = new Pair(Boolean.TRUE, bpu.b);
                        boolean booleanValue22 = ((Boolean) pair.getFirst()).booleanValue();
                        List list622 = (List) pair.getSecond();
                        list3 = SimpleIdFormFieldEntity.sorted;
                        if (simpleIdFormFieldEntity2 == kotlin.collections.a.P(list3)) {
                        }
                        String a22 = des0Var.a(simpleIdFormFieldEntity2, b);
                        i = iArr[simpleIdFormFieldEntity2.ordinal()];
                        bes0 bes0Var22 = aes0.a;
                        switch (i) {
                        }
                    case 6:
                        pair = new Pair(Boolean.TRUE, bpu.d);
                        boolean booleanValue222 = ((Boolean) pair.getFirst()).booleanValue();
                        List list6222 = (List) pair.getSecond();
                        list3 = SimpleIdFormFieldEntity.sorted;
                        if (simpleIdFormFieldEntity2 == kotlin.collections.a.P(list3)) {
                        }
                        String a222 = des0Var.a(simpleIdFormFieldEntity2, b);
                        i = iArr[simpleIdFormFieldEntity2.ordinal()];
                        bes0 bes0Var222 = aes0.a;
                        switch (i) {
                        }
                    default:
                        w511.b();
                        return null;
                }
            case 4:
                lb21 lb21Var = (lb21) obj2;
                jb21 jb21Var = (jb21) obj;
                lb21Var.getClass();
                ja21 ja21Var3 = jb21Var.b;
                boolean z7 = jb21Var.d;
                u8j0 u8j0Var2 = jb21Var.a;
                boolean z8 = u8j0Var2 instanceof t8j0;
                kao a3 = u8j0Var2 instanceof s8j0 ? r501.a(((s8j0) u8j0Var2).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null;
                boolean z9 = !z7;
                rfs0 rfs0Var = (rfs0) u8j0Var2.a();
                Text.Constant e3 = (rfs0Var == null || (str = rfs0Var.b) == null) ? null : com.ybsdk.core.utils.text.d.e(str);
                SimpleIdFormFieldEntity.Companion.getClass();
                list4 = SimpleIdFormFieldEntity.sorted;
                List list7 = list4;
                Text.Constant constant = e3;
                ArrayList arrayList = new ArrayList(tcc.n(list7, 10));
                Iterator it = list7.iterator();
                while (it.hasNext()) {
                    SimpleIdFormFieldEntity simpleIdFormFieldEntity3 = (SimpleIdFormFieldEntity) it.next();
                    boolean z10 = z;
                    des0 des0Var2 = lb21Var.a;
                    boolean z11 = z2;
                    String b2 = ja21Var3.b(simpleIdFormFieldEntity3);
                    sb21 sb21Var2 = simpleIdFormFieldEntity3 == SimpleIdFormFieldEntity.INN_OR_SNILS ? jb21Var.e : null;
                    if (sb21Var2 == null) {
                        sb21Var2 = ob21Var;
                    }
                    Iterator it2 = it;
                    UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType2 = ja21Var3.h;
                    boolean z12 = z9;
                    int[] iArr2 = kb21.a;
                    switch (iArr2[simpleIdFormFieldEntity3.ordinal()]) {
                        case 1:
                            ja21Var = ja21Var3;
                            u8j0Var = u8j0Var2;
                            resource4 = new Text.Resource(dzh0.ybsdk_uprid_first_name_title);
                            Text.Resource resource7 = resource4;
                            Text a4 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            boolean z13 = (jb21Var.c || (des0Var2.e(simpleIdFormFieldEntity3, b2) instanceof aes0)) ? z10 : z11;
                            if (!sb21Var2.equals(ob21Var)) {
                                loadingState2 = LoadableInput.LoadingState.DEFAULT;
                            } else if (sb21Var2.equals(pb21Var)) {
                                loadingState2 = LoadableInput.LoadingState.DEFAULT;
                            } else if (sb21Var2.equals(qb21Var)) {
                                loadingState2 = LoadableInput.LoadingState.LOADING;
                            } else {
                                if (!(sb21Var2 instanceof rb21)) {
                                    w511.b();
                                    return null;
                                }
                                loadingState2 = ((rb21) sb21Var2).a.contains(b2) ? LoadableInput.LoadingState.SUCCESS : LoadableInput.LoadingState.DEFAULT;
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource7, a4, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        case 2:
                            ja21Var = ja21Var3;
                            u8j0Var = u8j0Var2;
                            resource4 = new Text.Resource(dzh0.ybsdk_uprid_last_name_title);
                            Text.Resource resource72 = resource4;
                            Text a42 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            if (jb21Var.c) {
                                break;
                            }
                            if (!sb21Var2.equals(ob21Var)) {
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource72, a42, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        case 3:
                            ja21Var = ja21Var3;
                            u8j0Var = u8j0Var2;
                            resource4 = new Text.Resource(dzh0.ybsdk_uprid_middle_name_title);
                            Text.Resource resource722 = resource4;
                            Text a422 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            if (jb21Var.c) {
                            }
                            if (!sb21Var2.equals(ob21Var)) {
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource722, a422, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        case 4:
                            ja21Var = ja21Var3;
                            u8j0Var = u8j0Var2;
                            resource4 = new Text.Resource(dzh0.ybsdk_uprid_birth_date_title);
                            Text.Resource resource7222 = resource4;
                            Text a4222 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            if (jb21Var.c) {
                            }
                            if (!sb21Var2.equals(ob21Var)) {
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource7222, a4222, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        case 5:
                            ja21Var = ja21Var3;
                            u8j0Var = u8j0Var2;
                            resource4 = new Text.Resource(dzh0.ybsdk_uprid_passport_title);
                            Text.Resource resource72222 = resource4;
                            Text a42222 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            if (jb21Var.c) {
                            }
                            if (!sb21Var2.equals(ob21Var)) {
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource72222, a42222, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        case 6:
                            ja21Var = ja21Var3;
                            if (upgradeFormEntity$SecondDocumentType2 == UpgradeFormEntity$SecondDocumentType.INN) {
                                u8j0Var = u8j0Var2;
                                resource4 = new Text.Resource(dzh0.ybsdk_uprid_taxes_id_title);
                            } else {
                                u8j0Var = u8j0Var2;
                                if (upgradeFormEntity$SecondDocumentType2 == UpgradeFormEntity$SecondDocumentType.SNILS) {
                                    resource4 = new Text.Resource(dzh0.ybsdk_uprid_insurance_account_id_title);
                                } else if (b2.length() == 0 && (sb21Var2 instanceof qb21)) {
                                    resource4 = new Text.Resource(dzh0.ybsdk_uprid_taxes_id_title);
                                } else {
                                    des0Var2.getClass();
                                    resource4 = des0.c(b2) ? new Text.Resource(dzh0.ybsdk_uprid_insurance_account_id_title) : des0.b(b2) ? new Text.Resource(dzh0.ybsdk_uprid_taxes_id_title) : new Text.Resource(dzh0.ybsdk_uprid_taxes_or_insurance_account_id_title);
                                }
                            }
                            Text.Resource resource722222 = resource4;
                            Text a422222 = iArr2[simpleIdFormFieldEntity3.ordinal()] != 6 ? lb21Var.b.a(b2, sb21Var2, upgradeFormEntity$SecondDocumentType2, SecondDocumentHelperTextMapper$SecondDocumentDisplayType.SUMMARY) : Text.Empty.INSTANCE;
                            if (jb21Var.c) {
                            }
                            if (!sb21Var2.equals(ob21Var)) {
                            }
                            arrayList.add(new ma21(simpleIdFormFieldEntity3, resource722222, a422222, b2, z13, loadingState2, z12));
                            it = it2;
                            z9 = z12;
                            z = z10;
                            z2 = z11;
                            ja21Var3 = ja21Var;
                            u8j0Var2 = u8j0Var;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                }
                boolean z14 = z9;
                rfs0 rfs0Var2 = (rfs0) u8j0Var2.a();
                if (rfs0Var2 == null || (list5 = rfs0Var2.d) == null || (vfs0Var = (vfs0) kotlin.collections.a.P(list5)) == null) {
                    d451Var = null;
                } else {
                    ufs0 ufs0Var = vfs0Var.e;
                    if (ufs0Var == null) {
                        d451Var2 = null;
                    } else {
                        Text.Constant i5 = g8e.i(Text.Companion, vfs0Var.a);
                        String str2 = vfs0Var.b;
                        Text.Constant constant2 = str2 != null ? new Text.Constant(str2) : null;
                        String str3 = vfs0Var.d;
                        d451Var2 = new d451(i5, constant2, str3 != null ? new Text.Constant(str3) : null, ufs0Var.a, ufs0Var.b, ufs0Var.c, ufs0Var.d, ufs0Var.f, ufs0Var.e, vfs0Var.c, WidgetView$State$Type.INFO);
                    }
                    d451Var = d451Var2;
                }
                return new zb21(z8, z7, arrayList, a3, z14, constant, d451Var);
            default:
                ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity = (ErrorView$State$PrimaryButtonGravity) obj2;
                iu41 iu41Var = (iu41) obj;
                ou41 ou41Var = iu41Var.a;
                if (ou41Var instanceof lu41) {
                    return new ov41(false, false, r501.a(((lu41) ou41Var).a, null, null, null, null, errorView$State$PrimaryButtonGravity, null, null, null, null, null, null, null, 65470), "");
                }
                if (ou41Var instanceof mu41) {
                    ov41Var = new ov41(true, false, null, "");
                } else {
                    if (!ou41Var.equals(nu41.a)) {
                        w511.b();
                        return null;
                    }
                    String str4 = iu41Var.c;
                    ov41Var = new ov41(false, true, null, str4 != null ? str4 : "");
                }
                return ov41Var;
        }
    }

    public /* synthetic */ el11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
