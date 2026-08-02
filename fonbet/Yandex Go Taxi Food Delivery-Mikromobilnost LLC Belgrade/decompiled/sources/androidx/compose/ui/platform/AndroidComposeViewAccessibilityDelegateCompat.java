package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.a8a1;
import defpackage.ag;
import defpackage.ah;
import defpackage.aja1;
import defpackage.asy0;
import defpackage.awk0;
import defpackage.b7;
import defpackage.bh;
import defpackage.bhp0;
import defpackage.bip0;
import defpackage.ch;
import defpackage.ci9;
import defpackage.cif0;
import defpackage.cnq0;
import defpackage.cnu;
import defpackage.cvw;
import defpackage.dai0;
import defpackage.dh;
import defpackage.dmm0;
import defpackage.dry0;
import defpackage.e530;
import defpackage.eh;
import defpackage.ehr0;
import defpackage.f6w;
import defpackage.f73;
import defpackage.fwy;
import defpackage.fx80;
import defpackage.g9b1;
import defpackage.gja1;
import defpackage.gnq0;
import defpackage.gwk0;
import defpackage.gx80;
import defpackage.hcc;
import defpackage.hx80;
import defpackage.hz40;
import defpackage.hzh0;
import defpackage.i6w;
import defpackage.inq0;
import defpackage.ix80;
import defpackage.ixv;
import defpackage.iz40;
import defpackage.j63;
import defpackage.jb2;
import defpackage.jh;
import defpackage.jl40;
import defpackage.jnq0;
import defpackage.jq6;
import defpackage.jxi;
import defpackage.k82;
import defpackage.kk2;
import defpackage.kp50;
import defpackage.kp60;
import defpackage.l82;
import defpackage.lqh;
import defpackage.m810;
import defpackage.m82;
import defpackage.m9b1;
import defpackage.n82;
import defpackage.nif;
import defpackage.nr11;
import defpackage.ny61;
import defpackage.ohh0;
import defpackage.oyr;
import defpackage.ph;
import defpackage.pnt0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qy40;
import defpackage.r5c;
import defpackage.r5w;
import defpackage.rq90;
import defpackage.rty;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sg;
import defpackage.sia1;
import defpackage.sls;
import defpackage.t300;
import defpackage.th;
import defpackage.tia1;
import defpackage.tls;
import defpackage.u5w;
import defpackage.ux40;
import defpackage.v5w;
import defpackage.vh;
import defpackage.vx40;
import defpackage.w511;
import defpackage.wh;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.wx40;
import defpackage.wz40;
import defpackage.x4e;
import defpackage.x5w;
import defpackage.xva1;
import defpackage.xx40;
import defpackage.y5w;
import defpackage.z0y;
import defpackage.zia1;
import defpackage.zii0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0011\b\u0001\u0018\u0000 Ú\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006Û\u0002¨\u0002\u008b\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\nH\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010/\u001a\u00020\nH\u0080@¢\u0006\u0004\b-\u0010.J\u0017\u00104\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010+J5\u0010\u001a\u001a\u00020\u000e2\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b?\u0010@J\u0011\u0010A\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u000207H\u0002¢\u0006\u0004\bE\u0010FJ/\u0010K\u001a\u00020D2\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020 H\u0002¢\u0006\u0004\bK\u0010LJ'\u0010P\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010M\u001a\u00020>2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010C\u001a\u00020N2\u0006\u0010M\u001a\u00020>H\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010T\u001a\u00020\n*\u00020>2\u0006\u0010C\u001a\u00020NH\u0002¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u0004\u0018\u00010W*\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020\n2\u0006\u0010C\u001a\u00020N2\u0006\u0010M\u001a\u00020>H\u0002¢\u0006\u0004\bZ\u0010SJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u0010\\J=\u0010c\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u00142\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010`H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010h\u001a\u00020e2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u0014H\u0003¢\u0006\u0004\bh\u0010iJ?\u0010o\u001a\u00020e2\u0006\u0010=\u001a\u00020\u00142\b\u0010j\u001a\u0004\u0018\u00010\u00142\b\u0010k\u001a\u0004\u0018\u00010\u00142\b\u0010l\u001a\u0004\u0018\u00010\u00142\b\u0010n\u001a\u0004\u0018\u00010mH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\bq\u0010\\J)\u0010u\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010r\u001a\u00020\u00142\b\u0010t\u001a\u0004\u0018\u00010sH\u0002¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\u00020\u000e*\u00020NH\u0003¢\u0006\u0004\bw\u0010xJ\u0013\u0010y\u001a\u00020\u000e*\u00020NH\u0002¢\u0006\u0004\by\u0010xJ#\u0010~\u001a\u00020\u0016*\u00020N2\u0006\u0010z\u001a\u00020N2\u0006\u0010{\u001a\u00020\u0016H\u0002¢\u0006\u0004\b|\u0010}J%\u0010\u0081\u0001\u001a\u00020\u0016*\u00020N2\u0006\u0010z\u001a\u00020N2\u0006\u0010\u007f\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0080\u0001\u0010}J5\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010M\u001a\u00020>2\u0007\u0010\u0082\u0001\u001a\u00020a2\b\u0010t\u001a\u0004\u0018\u00010sH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J.\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0006\u0010C\u001a\u00020N2\u0007\u0010\u0085\u0001\u001a\u00020D2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J \u0010\u008b\u0001\u001a\u00030\u0088\u0001*\u00020D2\u0007\u0010\u0085\u0001\u001a\u00020DH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J*\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010N2\b\u0010\u008e\u0001\u001a\u00030\u0088\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J,\u0010\u0099\u0001\u001a\u00030\u0096\u0001*\u00030\u0086\u00012\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J+\u0010\u009c\u0001\u001a\u0004\u0018\u00010D*\u00030\u0096\u00012\u0007\u0010\u009a\u0001\u001a\u00020 2\u0007\u0010\u009b\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001*\u00030\u0096\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J,\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001*\u00030\u0096\u00012\u0007\u0010\u009a\u0001\u001a\u00020 2\u0007\u0010\u009b\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J-\u0010\u009c\u0001\u001a\u00020D*\u00030\u0088\u00012\t\b\u0002\u0010\u009a\u0001\u001a\u00020 2\t\b\u0002\u0010\u009b\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b\u009c\u0001\u0010¤\u0001J\u001a\u0010¥\u0001\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J4\u0010¨\u0001\u001a\u0004\u0018\u00018\u0000\"\t\b\u0000\u0010§\u0001*\u00020m2\b\u0010n\u001a\u0004\u0018\u00018\u00002\t\b\u0001\u0010\u0093\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0005\bª\u0001\u00103J\u0019\u0010«\u0001\u001a\u00020\n2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0005\b«\u0001\u00103J$\u0010®\u0001\u001a\u00020\n2\u0006\u00101\u001a\u0002002\b\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b°\u0001\u0010+J\u0011\u0010±\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b±\u0001\u0010+J!\u0010³\u0001\u001a\u00020\n2\r\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020706H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J+\u0010¸\u0001\u001a\u00020\u000e2\u0007\u0010µ\u0001\u001a\u00020\u00142\u000e\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010`H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001c\u0010»\u0001\u001a\u00020\n2\b\u0010º\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J.\u0010¿\u0001\u001a\u00020\n2\u0007\u0010½\u0001\u001a\u00020\u00142\u0006\u0010_\u001a\u00020\u00142\t\u0010¾\u0001\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J%\u0010Ä\u0001\u001a\u00020\n2\u0007\u0010Á\u0001\u001a\u00020N2\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001b\u0010Æ\u0001\u001a\u00020\u00142\u0007\u0010µ\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J5\u0010Ë\u0001\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020N2\u0007\u0010È\u0001\u001a\u00020\u00142\u0007\u0010É\u0001\u001a\u00020\u000e2\u0007\u0010Ê\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001b\u0010Í\u0001\u001a\u00020\n2\u0007\u0010½\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bÍ\u0001\u0010¦\u0001J5\u0010Ñ\u0001\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020N2\u0007\u0010Î\u0001\u001a\u00020\u00142\u0007\u0010Ï\u0001\u001a\u00020\u00142\u0007\u0010Ð\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001a\u0010Ó\u0001\u001a\u00020\u00142\u0006\u0010C\u001a\u00020NH\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001a\u0010Õ\u0001\u001a\u00020\u00142\u0006\u0010C\u001a\u00020NH\u0002¢\u0006\u0006\bÕ\u0001\u0010Ô\u0001J\u0019\u0010Ö\u0001\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020NH\u0002¢\u0006\u0005\bÖ\u0001\u0010xJ(\u0010Ø\u0001\u001a\u0005\u0018\u00010×\u00012\b\u0010C\u001a\u0004\u0018\u00010N2\u0007\u0010È\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u001e\u0010Ú\u0001\u001a\u0004\u0018\u00010a2\b\u0010C\u001a\u0004\u0018\u00010NH\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u0019\u0010Ý\u0001\u001a\u0004\u0018\u00010V*\u00030Ü\u0001H\u0002¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001R\u001a\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u000f\n\u0005\b\u0006\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R0\u0010â\u0001\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bâ\u0001\u0010ã\u0001\u0012\u0005\bç\u0001\u0010+\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010¦\u0001R=\u0010é\u0001\u001a\u000f\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u000e0è\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bé\u0001\u0010ê\u0001\u0012\u0005\bï\u0001\u0010+\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ñ\u0001\u001a\u00030ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R0\u0010ô\u0001\u001a\u00020\u000e2\u0007\u0010ó\u0001\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0005\bö\u0001\u0010<\"\u0005\b÷\u0001\u0010\u0011R*\u0010ù\u0001\u001a\u00030ø\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R\"\u0010\u0080\u0002\u001a\u000b\u0012\u0005\u0012\u00030ÿ\u0001\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R+\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u0089\u0002\u001a\u00030\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001e\u0010\u008c\u0002\u001a\u00070\u008b\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0019\u0010\u008e\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010ã\u0001R\u0019\u0010\u008f\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010ã\u0001R\u001b\u0010\u0090\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001b\u0010\u0092\u0002\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0091\u0002R\u0019\u0010\u0093\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010õ\u0001R\u001f\u0010\u0096\u0002\u001a\n\u0012\u0005\u0012\u00030\u0095\u00020\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001f\u0010\u0098\u0002\u001a\n\u0012\u0005\u0012\u00030\u0095\u00020\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0097\u0002R'\u0010\u009a\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020m0\u0099\u00020\u0099\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R'\u0010\u009d\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020m0\u009c\u00020\u0099\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009b\u0002R\u0019\u0010\u009e\u0002\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010ã\u0001R\u001b\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001e\u0010¢\u0002\u001a\t\u0012\u0004\u0012\u0002000¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u001e\u0010¥\u0002\u001a\t\u0012\u0004\u0012\u00020\n0¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010§\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010õ\u0001R\u001c\u0010©\u0002\u001a\u0005\u0018\u00010¨\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R%\u00108\u001a\b\u0012\u0004\u0012\u000207068B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b8\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u001a\u0010®\u0002\u001a\u00030¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R*\u0010±\u0002\u001a\u00030°\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0002\u0010²\u0002\u001a\u0006\b³\u0002\u0010´\u0002\"\u0006\bµ\u0002\u0010¶\u0002R*\u0010·\u0002\u001a\u00030°\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0002\u0010²\u0002\u001a\u0006\b¸\u0002\u0010´\u0002\"\u0006\b¹\u0002\u0010¶\u0002R\u001f\u0010º\u0002\u001a\u00020a8\u0000X\u0080D¢\u0006\u0010\n\u0006\bº\u0002\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R\u001f\u0010¾\u0002\u001a\u00020a8\u0000X\u0080D¢\u0006\u0010\n\u0006\b¾\u0002\u0010»\u0002\u001a\u0006\b¿\u0002\u0010½\u0002R\u0018\u0010Á\u0002\u001a\u00030À\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R!\u0010Ã\u0002\u001a\n\u0012\u0005\u0012\u00030Â\u00010\u0094\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010\u0097\u0002R\u001a\u0010Ä\u0002\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0019\u0010Æ\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0002\u0010õ\u0001R\u0018\u0010Ç\u0002\u001a\u00030°\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0002\u0010²\u0002R\u0018\u0010É\u0002\u001a\u00030È\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u001f\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030¶\u00010Ë\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0002\u0010\u0081\u0002R%\u0010Í\u0002\u001a\u0010\u0012\u0005\u0012\u00030¶\u0001\u0012\u0004\u0012\u00020\n0è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0002\u0010ê\u0001R\u0016\u0010Ï\u0002\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0002\u0010<R\u001e\u0010Ò\u0002\u001a\t\u0012\u0005\u0012\u00030ÿ\u00010`8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u0016\u0010Ó\u0002\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0002\u0010<R!\u0010×\u0002\u001a\u0005\u0018\u00010\u0088\u00028BX\u0082\u0004¢\u0006\u000f\u0012\u0005\bÖ\u0002\u0010+\u001a\u0006\bÔ\u0002\u0010Õ\u0002R\u001a\u0010E\u001a\u00020D*\u00020>8BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002¨\u0006Ü\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/view/View;", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", BackendConfig.Restrictions.ENABLED, "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "vertical", "", "direction", "Lwu60;", "position", "canScroll-0AR0LA0$ui", "(ZIJ)Z", "canScroll", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchHoverEvent$ui", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "", RemoteBioParameters.X, RemoteBioParameters.Y, "hitTestSemanticsAt$ui", "(FF)I", "hitTestSemanticsAt", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "onSemanticsChange$ui", "()V", "onSemanticsChange", "boundsUpdatesEventLoop$ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "resetEnabledAccessibilityServiceList", "Lx5w;", "Ljnq0;", "currentSemanticsNodes", "canScroll-moWRBKg", "(Lx5w;ZIJ)Z", "isRequestFromAccessibilityTool", "()Z", "virtualViewId", "Lwh;", "createNodeInfo", "(I)Lwh;", "emptyNodeInfoOrNull", "()Lwh;", "node", "Landroid/graphics/Rect;", "boundsInScreen", "(Ljnq0;)Landroid/graphics/Rect;", "left", "top", "right", "bottom", "toBoundsInScreen", "(FFFF)Landroid/graphics/Rect;", "info", "Landroidx/compose/ui/semantics/c;", "semanticsNode", "populateAccessibilityNodeInfoProperties", "(ILwh;Landroidx/compose/ui/semantics/c;)V", "setContentInvalid", "(Landroidx/compose/ui/semantics/c;Lwh;)V", "setInvisibleIfEmptyBounds", "(Lwh;Landroidx/compose/ui/semantics/c;)V", "Lkk2;", "Landroid/text/SpannableString;", "toSpannableString", "(Lkk2;)Landroid/text/SpannableString;", "setText", "isAccessibilityFocused", "(I)Z", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "sendEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "createEvent", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "(IILandroid/os/Bundle;)Z", "legacyScrollOntoScreen", "(Landroidx/compose/ui/semantics/c;)Z", "scrollOntoScreen", "scrollableAncestor", "offset", "adjustForReversedScrollingAndRtl-RE3cj74", "(Landroidx/compose/ui/semantics/c;Landroidx/compose/ui/semantics/c;J)J", "adjustForReversedScrollingAndRtl", "offsetAdjustment", "scrollDxDyForNodeVisible-RE3cj74", "scrollDxDyForNodeVisible", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "(ILwh;Ljava/lang/String;Landroid/os/Bundle;)V", "nodeBoundsInScreen", "Lehr0;", "shape", "Lzii0;", "getShapeBounds", "(Landroidx/compose/ui/semantics/c;Landroid/graphics/Rect;Lehr0;)Lzii0;", "toBoundsRelativeToNodeBounds", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lzii0;", "textNode", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "(Landroidx/compose/ui/semantics/c;Lzii0;)Landroid/graphics/RectF;", "Lcjs0;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lix80;", "createOutline-12SF9DM", "(Lehr0;JLandroidx/compose/ui/unit/LayoutDirection;)Lix80;", "createOutline", "leftOffset", "topOffset", "toAndroidRect", "(Lix80;FF)Landroid/graphics/Rect;", "", "toCornerArray", "(Lix80;)[F", "Landroid/graphics/Region;", "toRegion", "(Lix80;FF)Landroid/graphics/Region;", "(Lzii0;FF)Landroid/graphics/Rect;", "updateHoveredVirtualView", "(I)V", "T", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "notifySubtreeAccessibilityStateChangedIfNeeded", "sendTypeViewScrolledAccessibilityEvent", "Lxx40;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "(Landroidx/compose/ui/node/LayoutNode;Lxx40;)V", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents", "(Lx5w;)V", "id", "Lbip0;", "oldScrollObservationScopes", "registerScrollingId", "(ILjava/util/List;)Z", "scrollObservationScope", "scheduleScrollEventIfNeeded", "(Lbip0;)V", "semanticsNodeId", "title", "sendPaneChangeEvents", "(IILjava/lang/String;)V", "newNode", "Linq0;", "oldNode", "sendAccessibilitySemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/c;Linq0;)V", "semanticsNodeIdToAccessibilityVirtualNodeId", "(I)I", "granularity", "forward", "extendSelection", "traverseAtGranularity", "(Landroidx/compose/ui/semantics/c;IZZ)Z", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "(Landroidx/compose/ui/semantics/c;IIZ)Z", "getAccessibilitySelectionStart", "(Landroidx/compose/ui/semantics/c;)I", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "Leh;", "getIteratorForGranularity", "(Landroidx/compose/ui/semantics/c;I)Leh;", "getIterableTextForAccessibility", "(Landroidx/compose/ui/semantics/c;)Ljava/lang/String;", "Lcnq0;", "getTextForTextField", "(Lcnq0;)Lkk2;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", CA20Status.STATUS_USER_I, "getHoveredVirtualViewId$ui", "()I", "setHoveredVirtualViewId$ui", "getHoveredVirtualViewId$ui$annotations", "Lkotlin/Function1;", "onSendAccessibilityEvent", "Ltls;", "getOnSendAccessibilityEvent$ui", "()Ltls;", "setOnSendAccessibilityEvent$ui", "(Ltls;)V", "getOnSendAccessibilityEvent$ui$annotations", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "value", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui", "setAccessibilityForceEnabledForTesting$ui", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui", "(J)V", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "_enabledServices", "Ljava/util/List;", "requestFromAccessibilityToolForTesting", "Ljava/lang/Boolean;", "getRequestFromAccessibilityToolForTesting$ui", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui", "(Ljava/lang/Boolean;)V", "Landroid/os/Handler;", "legacyMainHandler", "Landroid/os/Handler;", "Ll82;", "nodeProvider", "Ll82;", "accessibilityFocusedVirtualViewId", "focusedVirtualViewId", "currentlyAccessibilityFocusedANI", "Lwh;", "currentlyFocusedANI", "sendingFocusAffectingEvent", "Lwx40;", "Lbhp0;", "pendingHorizontalScrollEvents", "Lwx40;", "pendingVerticalScrollEvents", "Lpnt0;", "actionIdToLabel", "Lpnt0;", "Lqy40;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "Lj63;", "subtreeChangedLayoutNodes", "Lj63;", "Lci9;", "boundsUpdateChannel", "Lci9;", "currentSemanticsNodesInvalidated", "Lm82;", "pendingTextTraversedEvent", "Lm82;", "Lx5w;", "getCurrentSemanticsNodes", "()Lx5w;", "paneDisplayed", "Lxx40;", "Lux40;", "idToBeforeMap", "Lux40;", "getIdToBeforeMap$ui", "()Lux40;", "setIdToBeforeMap$ui", "(Lux40;)V", "idToAfterMap", "getIdToAfterMap$ui", "setIdToAfterMap$ui", "ExtraDataTestTraversalBeforeVal", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui", "Lnr11;", "urlSpanCache", "Lnr11;", "previousSemanticsNodes", "previousSemanticsRoot", "Linq0;", "checkingForSemanticsChanges", "drawingOrder", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "isEnabled$ui", "isEnabled", "getEnabledServices", "()Ljava/util/List;", "enabledServices", "isTouchExplorationEnabled", "getHandler", "()Landroid/os/Handler;", "getHandler$annotations", "handler", "getBoundsInScreen", "(Lwh;)Landroid/graphics/Rect;", "Companion", "k82", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int $stable = 8;
    private static final u5w AccessibilityActionsResourceIds;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final k82 Companion = new k82();
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private boolean accessibilityForceEnabledForTesting;
    private final AccessibilityManager accessibilityManager;
    private boolean checkingForSemanticsChanges;
    private x5w currentSemanticsNodes;
    private wh currentlyAccessibilityFocusedANI;
    private wh currentlyFocusedANI;
    private final ux40 drawingOrder;
    private ux40 idToAfterMap;
    private ux40 idToBeforeMap;
    private xx40 paneDisplayed;
    private m82 pendingTextTraversedEvent;
    private wx40 previousSemanticsNodes;
    private inq0 previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final tls scheduleScrollEventIfNeededLambda;
    private final List<bip0> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final nr11 urlSpanCache;
    private final AndroidComposeView view;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private tls onSendAccessibilityEvent = new tls() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), (AccessibilityEvent) obj));
        }
    };
    private long SendRecurringAccessibilityEventsIntervalMillis = 100;
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());
    private l82 nodeProvider = new l82(this);
    private int accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    private int focusedVirtualViewId = Integer.MIN_VALUE;
    private final wx40 pendingHorizontalScrollEvents = new wx40((Object) null);
    private final wx40 pendingVerticalScrollEvents = new wx40((Object) null);
    private pnt0 actionIdToLabel = new pnt0((Object) null);
    private pnt0 labelToActionId = new pnt0((Object) null);
    private int accessibilityCursorPosition = -1;
    private final j63 subtreeChangedLayoutNodes = new j63(0);
    private final ci9 boundsUpdateChannel = sb2.a(1, null, null, 6);
    private boolean currentSemanticsNodesInvalidated = true;

    static {
        int[] iArr = {ohh0.accessibility_custom_action_0, ohh0.accessibility_custom_action_1, ohh0.accessibility_custom_action_2, ohh0.accessibility_custom_action_3, ohh0.accessibility_custom_action_4, ohh0.accessibility_custom_action_5, ohh0.accessibility_custom_action_6, ohh0.accessibility_custom_action_7, ohh0.accessibility_custom_action_8, ohh0.accessibility_custom_action_9, ohh0.accessibility_custom_action_10, ohh0.accessibility_custom_action_11, ohh0.accessibility_custom_action_12, ohh0.accessibility_custom_action_13, ohh0.accessibility_custom_action_14, ohh0.accessibility_custom_action_15, ohh0.accessibility_custom_action_16, ohh0.accessibility_custom_action_17, ohh0.accessibility_custom_action_18, ohh0.accessibility_custom_action_19, ohh0.accessibility_custom_action_20, ohh0.accessibility_custom_action_21, ohh0.accessibility_custom_action_22, ohh0.accessibility_custom_action_23, ohh0.accessibility_custom_action_24, ohh0.accessibility_custom_action_25, ohh0.accessibility_custom_action_26, ohh0.accessibility_custom_action_27, ohh0.accessibility_custom_action_28, ohh0.accessibility_custom_action_29, ohh0.accessibility_custom_action_30, ohh0.accessibility_custom_action_31};
        vx40 vx40Var = v5w.a;
        vx40 vx40Var2 = new vx40(32);
        int i = vx40Var2.b;
        if (i < 0) {
            xva1.d("");
            throw null;
        }
        int i2 = i + 32;
        vx40Var2.d(i2);
        int[] iArr2 = vx40Var2.a;
        int i3 = vx40Var2.b;
        if (i != i3) {
            f73.d(i2, i, i3, iArr2, iArr2);
        }
        f73.h(i, 0, 12, iArr, iArr2);
        vx40Var2.b += 32;
        AccessibilityActionsResourceIds = vx40Var2;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        this.accessibilityManager = (AccessibilityManager) androidComposeView.getContext().getSystemService("accessibility");
        wx40 wx40Var = y5w.a;
        this.currentSemanticsNodes = wx40Var;
        this.paneDisplayed = new xx40((Object) null);
        this.idToBeforeMap = new ux40((Object) null);
        this.idToAfterMap = new ux40((Object) null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new nr11();
        this.previousSemanticsNodes = y5w.a();
        this.previousSemanticsRoot = new inq0(androidComposeView.getSemanticsOwner().a(), wx40Var);
        int i = r5w.a;
        this.drawingOrder = new ux40((Object) null);
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new b7(5, this);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new tls() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded((bip0) obj);
                return zy11.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, wh info, String extraDataKey, Bundle arguments) {
        androidx.compose.ui.semantics.c cVar;
        ehr0 ehr0Var;
        float[] cornerArray;
        jnq0 jnq0Var = (jnq0) getCurrentSemanticsNodes().b(virtualViewId);
        if (jnq0Var == null || (cVar = jnq0Var.a) == null) {
            return;
        }
        LayoutNode layoutNode = cVar.c;
        cnq0 cnq0Var = cVar.d;
        hz40 hz40Var = cnq0Var.a;
        String iterableTextForAccessibility = getIterableTextForAccessibility(cVar);
        if (jl40.l(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int e = this.idToBeforeMap.e(virtualViewId);
            if (e != -1) {
                info.a.getExtras().putInt(extraDataKey, e);
                return;
            }
            return;
        }
        if (jl40.l(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int e2 = this.idToAfterMap.e(virtualViewId);
            if (e2 != -1) {
                info.a.getExtras().putInt(extraDataKey, e2);
                return;
            }
            return;
        }
        if (hz40Var.b(androidx.compose.ui.semantics.a.a) && arguments != null && jl40.l(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 > 0 && i >= 0) {
                if (i < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    dry0 f = m9b1.f(cnq0Var);
                    if (f == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i + i3;
                        if (i4 >= f.g().c().b.length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(cVar, f.b(i4)));
                        }
                    }
                    info.a.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.A;
        if (hz40Var.b(gVar) && arguments != null && jl40.l(extraDataKey, ExtraDataTestTagKey)) {
            String str = (String) androidx.compose.ui.semantics.b.a(cnq0Var, gVar);
            if (str != null) {
                info.a.getExtras().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (jl40.l(extraDataKey, ExtraDataIdKey)) {
            info.a.getExtras().putInt(extraDataKey, cVar.f);
            return;
        }
        if (jl40.l(extraDataKey, ExtraDataShapeTypeKey)) {
            ehr0 ehr0Var2 = (ehr0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.Q);
            if (ehr0Var2 != null) {
                zii0 shapeBounds = getShapeBounds(cVar, getBoundsInScreen(info), ehr0Var2);
                long d = shapeBounds.d();
                float f2 = shapeBounds.b;
                float f3 = shapeBounds.a;
                ix80 m75createOutline12SF9DM = m75createOutline12SF9DM(ehr0Var2, d, layoutNode.S);
                if (m75createOutline12SF9DM instanceof gx80) {
                    info.a.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    info.a.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m75createOutline12SF9DM, f3, f2));
                    return;
                }
                if (m75createOutline12SF9DM instanceof hx80) {
                    AccessibilityNodeInfo accessibilityNodeInfo = info.a;
                    accessibilityNodeInfo.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    accessibilityNodeInfo.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(m75createOutline12SF9DM, f3, f2));
                    accessibilityNodeInfo.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(m75createOutline12SF9DM));
                    return;
                }
                if (!(m75createOutline12SF9DM instanceof fx80)) {
                    w511.b();
                    return;
                } else {
                    info.a.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                    info.a.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(m75createOutline12SF9DM, f3, f2));
                    return;
                }
            }
            return;
        }
        if (jl40.l(extraDataKey, ExtraDataShapeRectKey)) {
            ehr0 ehr0Var3 = (ehr0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.Q);
            if (ehr0Var3 != null) {
                zii0 shapeBounds2 = getShapeBounds(cVar, getBoundsInScreen(info), ehr0Var3);
                Rect androidRect = toAndroidRect(m75createOutline12SF9DM(ehr0Var3, shapeBounds2.d(), layoutNode.S), shapeBounds2.a, shapeBounds2.b);
                if (androidRect != null) {
                    info.a.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (jl40.l(extraDataKey, ExtraDataShapeRectCornersKey)) {
            ehr0 ehr0Var4 = (ehr0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.Q);
            if (ehr0Var4 == null || (cornerArray = toCornerArray(m75createOutline12SF9DM(ehr0Var4, getShapeBounds(cVar, getBoundsInScreen(info), ehr0Var4).d(), layoutNode.S))) == null) {
                return;
            }
            info.a.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (!jl40.l(extraDataKey, ExtraDataShapeRegionKey) || (ehr0Var = (ehr0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.Q)) == null) {
            return;
        }
        zii0 shapeBounds3 = getShapeBounds(cVar, getBoundsInScreen(info), ehr0Var);
        Region region = toRegion(m75createOutline12SF9DM(ehr0Var, shapeBounds3.d(), layoutNode.S), shapeBounds3.a, shapeBounds3.b);
        if (region != null) {
            info.a.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
        }
    }

    /* renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m73adjustForReversedScrollingAndRtlRE3cj74(androidx.compose.ui.semantics.c cVar, androidx.compose.ui.semantics.c cVar2, long j) {
        if (wu60.c(j, 0L)) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (dai0.b(cVar)) {
            intBitsToFloat = -intBitsToFloat;
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(jnq0 node) {
        f6w f6wVar = node.b;
        return toBoundsInScreen(f6wVar.a, f6wVar.b, f6wVar.c, f6wVar.d);
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m74canScrollmoWRBKg(x5w currentSemanticsNodes, boolean vertical, int direction, long position) {
        androidx.compose.ui.semantics.g gVar;
        long[] jArr;
        long[] jArr2;
        int i;
        bhp0 bhp0Var;
        if (!wu60.c(position, 9205357640488583168L) && (((9223372034707292159L & position) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            if (vertical) {
                gVar = androidx.compose.ui.semantics.d.w;
            } else {
                if (vertical) {
                    w511.b();
                    return false;
                }
                gVar = androidx.compose.ui.semantics.d.v;
            }
            Object[] objArr = currentSemanticsNodes.c;
            long[] jArr3 = currentSemanticsNodes.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j) < 128) {
                                jnq0 jnq0Var = (jnq0) objArr[(i2 << 3) + i5];
                                f6w f6wVar = jnq0Var.b;
                                float f = f6wVar.a;
                                i = i3;
                                float f2 = f6wVar.b;
                                jArr2 = jArr3;
                                float f3 = f6wVar.c;
                                float f4 = f6wVar.d;
                                float intBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (position & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                if (((intBitsToFloat < f3) & (intBitsToFloat >= f) & (intBitsToFloat2 >= f2) & (intBitsToFloat2 < f4)) && (bhp0Var = (bhp0) androidx.compose.ui.semantics.b.a(jnq0Var.a.d, gVar)) != null) {
                                    if (direction < 0) {
                                        if (((Number) bhp0Var.b().invoke()).floatValue() <= 0.0f) {
                                        }
                                        z = true;
                                    } else {
                                        if (((Number) bhp0Var.b().invoke()).floatValue() >= ((Number) bhp0Var.a().invoke()).floatValue()) {
                                        }
                                        z = true;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            return z;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        return z;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
        }
        return false;
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().a(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        jnq0 jnq0Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(eventType);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        if (isEnabled$ui() && (jnq0Var = (jnq0) getCurrentSemanticsNodes().b(virtualViewId)) != null) {
            androidx.compose.ui.semantics.c cVar = jnq0Var.a;
            obtain.setPassword(cVar.d.a.b(androidx.compose.ui.semantics.d.L));
            boolean l = jl40.l(androidx.compose.ui.semantics.b.a(cVar.d, androidx.compose.ui.semantics.d.o), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                sg.h(obtain, l);
            }
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wh createNodeInfo(int virtualViewId) {
        jnq0 jnq0Var;
        if (this.view.getComposeViewContext().c.getLifecycle().b() != Lifecycle.State.DESTROYED && (jnq0Var = (jnq0) getCurrentSemanticsNodes().b(virtualViewId)) != null) {
            androidx.compose.ui.semantics.c cVar = jnq0Var.a;
            boolean l = jl40.l(androidx.compose.ui.semantics.b.a(cVar.k(), androidx.compose.ui.semantics.d.o), Boolean.TRUE);
            if (l && !isRequestFromAccessibilityTool()) {
                return null;
            }
            wh h = wh.h();
            AccessibilityNodeInfo accessibilityNodeInfo = h.a;
            if (Build.VERSION.SDK_INT >= 34) {
                jh.g(accessibilityNodeInfo, l);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (l ? 64 : 0));
                }
            }
            if (virtualViewId == -1) {
                Object parentForAccessibility = this.view.getParentForAccessibility();
                h.A(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
            } else {
                androidx.compose.ui.semantics.c l2 = cVar.l();
                Integer valueOf = l2 != null ? Integer.valueOf(l2.f) : null;
                if (valueOf == null) {
                    ixv.c("semanticsNode " + virtualViewId + " has null parent");
                    ny61.A();
                    return null;
                }
                int intValue = valueOf.intValue();
                int i = intValue != this.view.getSemanticsOwner().a().f ? intValue : -1;
                AndroidComposeView androidComposeView = this.view;
                h.b = i;
                accessibilityNodeInfo.setParent(androidComposeView, i);
            }
            AndroidComposeView androidComposeView2 = this.view;
            h.c = virtualViewId;
            accessibilityNodeInfo.setSource(androidComposeView2, virtualViewId);
            h.l(boundsInScreen(jnq0Var));
            populateAccessibilityNodeInfoProperties(virtualViewId, h, cVar);
            return h;
        }
        return emptyNodeInfoOrNull();
    }

    /* renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final ix80 m75createOutline12SF9DM(ehr0 ehr0Var, long j, LayoutDirection layoutDirection) {
        return ehr0Var.a(j, layoutDirection, this.view.getDensity());
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent createEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            createEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            createEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            createEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            createEvent.getText().add(text);
        }
        return createEvent;
    }

    private final wh emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return wh.h();
    }

    private final int getAccessibilitySelectionEnd(androidx.compose.ui.semantics.c node) {
        cnq0 cnq0Var = node.d;
        if (!cnq0Var.a.b(androidx.compose.ui.semantics.d.a)) {
            androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.H;
            if (cnq0Var.a.b(gVar)) {
                return (int) (((asy0) cnq0Var.d(gVar)).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            }
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionStart(androidx.compose.ui.semantics.c node) {
        cnq0 cnq0Var = node.d;
        if (!cnq0Var.a.b(androidx.compose.ui.semantics.d.a)) {
            androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.H;
            if (cnq0Var.a.b(gVar)) {
                return (int) (((asy0) cnq0Var.d(gVar)).a >> 32);
            }
        }
        return this.accessibilityCursorPosition;
    }

    private final Rect getBoundsInScreen(wh whVar) {
        Rect rect = new Rect();
        whVar.f(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x5w getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = cvw.x(this.view.getSemanticsOwner(), AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.w);
            if (isEnabled$ui()) {
                final x5w x5wVar = this.currentSemanticsNodes;
                ux40 ux40Var = this.idToBeforeMap;
                ux40 ux40Var2 = this.idToAfterMap;
                final Resources resources = this.view.getContext().getResources();
                ux40Var.a();
                ux40Var2.a();
                jnq0 jnq0Var = (jnq0) x5wVar.b(-1);
                androidx.compose.ui.semantics.c cVar = jnq0Var != null ? jnq0Var.a : null;
                ArrayList b = androidx.compose.ui.semantics.h.b(cVar, new tls() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(x5w.this.a(((androidx.compose.ui.semantics.c) obj).f));
                    }
                }, new tls() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(dai0.c((androidx.compose.ui.semantics.c) obj, resources));
                    }
                }, Collections.singletonList(cVar));
                int f = scc.f(b);
                int i = 1;
                if (1 <= f) {
                    while (true) {
                        int i2 = ((androidx.compose.ui.semantics.c) b.get(i - 1)).f;
                        int i3 = ((androidx.compose.ui.semantics.c) b.get(i)).f;
                        ux40Var.g(i2, i3);
                        ux40Var2.g(i3, i2);
                        if (i == f) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.currentSemanticsNodes;
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Handler getHandler() {
        return this.view.getHandler();
    }

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    private final String getIterableTextForAccessibility(androidx.compose.ui.semantics.c node) {
        kk2 kk2Var;
        if (node != null) {
            cnq0 cnq0Var = node.d;
            hz40 hz40Var = cnq0Var.a;
            androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.a;
            if (hz40Var.b(gVar)) {
                return rty.a(62, null, ",", (List) cnq0Var.d(gVar));
            }
            if (hz40Var.b(androidx.compose.ui.semantics.d.G)) {
                kk2 textForTextField = getTextForTextField(cnq0Var);
                if (textForTextField != null) {
                    return textForTextField.b;
                }
            } else {
                List list = (List) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.C);
                if (list != null && (kk2Var = (kk2) kotlin.collections.a.R(list)) != null) {
                    return kk2Var.b;
                }
            }
        }
        return null;
    }

    private final eh getIteratorForGranularity(androidx.compose.ui.semantics.c node, int granularity) {
        dry0 f;
        if (node == null) {
            return null;
        }
        cnq0 cnq0Var = node.d;
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            ah f2 = sia1.f(this.view.getContext().getResources().getConfiguration().locale);
            f2.d(iterableTextForAccessibility);
            return f2;
        }
        if (granularity == 2) {
            ah c = gja1.c(this.view.getContext().getResources().getConfiguration().locale);
            c.d(iterableTextForAccessibility);
            return c;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                dh c2 = aja1.c();
                c2.d(iterableTextForAccessibility);
                return c2;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!cnq0Var.a.b(androidx.compose.ui.semantics.a.a) || (f = m9b1.f(cnq0Var)) == null) {
            return null;
        }
        if (granularity == 4) {
            bh bhVar = bh.d;
            bh f3 = tia1.f();
            f3.f(iterableTextForAccessibility, f);
            return f3;
        }
        ch chVar = ch.e;
        ch b = zia1.b();
        b.f(iterableTextForAccessibility, f, node);
        return b;
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private final zii0 getShapeBounds(androidx.compose.ui.semantics.c node, Rect nodeBoundsInScreen, ehr0 shape) {
        e530 node2;
        n82 n82Var = new n82(shape);
        LayoutNode layoutNode = node.c;
        t300 t300Var = layoutNode.a0;
        gnq0 gnq0Var = null;
        if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 8) != 0) {
            e530 e530Var = (e530) t300Var.g;
            loop0: while (true) {
                if (e530Var != null) {
                    if ((e530Var.getKindSet$ui() & 8) != 0) {
                        lqh lqhVar = e530Var;
                        ?? r5 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof gnq0) {
                                lqhVar.u(n82Var);
                                if (n82Var.b()) {
                                    gnq0Var = lqhVar;
                                    break loop0;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 8) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var2 = lqhVar.b;
                                int i = 0;
                                lqhVar = lqhVar;
                                r5 = r5;
                                while (e530Var2 != null) {
                                    if ((e530Var2.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            lqhVar = e530Var2;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r5.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r5.b(e530Var2);
                                        }
                                    }
                                    e530Var2 = e530Var2.getChild$ui();
                                    lqhVar = lqhVar;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            lqhVar = qje.c(r5);
                        }
                    }
                    if ((e530Var.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                    e530Var = e530Var.getChild$ui();
                } else {
                    break;
                }
            }
        }
        gnq0 gnq0Var2 = gnq0Var;
        if (gnq0Var2 == null || (node2 = gnq0Var2.getNode()) == null || !node2.isAttached()) {
            return gwk0.j((androidx.compose.ui.node.s) layoutNode.a0.e, false);
        }
        androidx.compose.ui.node.s O = qje.O(gnq0Var2);
        zii0 j = gwk0.o(O).j(O, false);
        return toBoundsRelativeToNodeBounds(toBoundsInScreen(j.a, j.b, j.c, j.d), nodeBoundsInScreen);
    }

    private final kk2 getTextForTextField(cnq0 cnq0Var) {
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.a;
        return (kk2) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.G);
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean isAccessibilitySelectionExtendable(androidx.compose.ui.semantics.c node) {
        if (node.d.a.b(androidx.compose.ui.semantics.d.a)) {
            return false;
        }
        return node.d.a.b(androidx.compose.ui.semantics.d.G);
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (jl40.l(bool, Boolean.TRUE)) {
            return true;
        }
        if (jl40.l(bool, Boolean.FALSE)) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (Build.VERSION.SDK_INT >= 34) {
            return jh.f(accessibilityManager);
        }
        return true;
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0013, code lost:
    
        r2 = null;
     */
    @jxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean legacyScrollOntoScreen(androidx.compose.ui.semantics.c cVar) {
        ag agVar;
        wls wlsVar;
        androidx.compose.ui.semantics.c l = cVar.l();
        if (l != null) {
            agVar = (ag) androidx.compose.ui.semantics.b.a(l.d, androidx.compose.ui.semantics.a.d);
            while (l != null && agVar == null) {
                l = l.l();
                if (l != null) {
                    agVar = (ag) androidx.compose.ui.semantics.b.a(l.d, androidx.compose.ui.semantics.a.d);
                }
            }
            if (l == null) {
                zii0 g = cVar.g();
                return this.view.requestRectangleOnScreen(new Rect((int) Math.floor(g.a), (int) Math.floor(g.b), m810.b((float) Math.ceil(g.c)), m810.b((float) Math.ceil(g.d))));
            }
            cnq0 cnq0Var = l.d;
            LayoutNode layoutNode = l.c;
            zii0 i = gwk0.i((androidx.compose.ui.node.f) layoutNode.a0.d);
            rzx q = ((androidx.compose.ui.node.f) layoutNode.a0.d).q();
            zii0 j = i.j(q != null ? ((androidx.compose.ui.node.s) q).v(0L) : 0L);
            long m = cVar.m();
            androidx.compose.ui.node.s d = cVar.d();
            zii0 b = wwg.b(m, rzo.a0(d != null ? d.c : 0L));
            float legacyScrollOntoScreen$scrollDelta = legacyScrollOntoScreen$scrollDelta(b.a - j.a, b.c - j.c);
            if (dai0.b(cVar)) {
                legacyScrollOntoScreen$scrollDelta = -legacyScrollOntoScreen$scrollDelta;
            }
            return (agVar == null || (wlsVar = (wls) agVar.a()) == null || !((Boolean) wlsVar.invoke(Float.valueOf(legacyScrollOntoScreen$scrollDelta), Float.valueOf(legacyScrollOntoScreen$scrollDelta(b.b - j.b, b.d - j.d)))).booleanValue()) ? false : true;
        }
        agVar = null;
    }

    private static final float legacyScrollOntoScreen$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.d(zy11.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performActionHelper(int virtualViewId, int action, Bundle arguments) {
        androidx.compose.ui.semantics.c cVar;
        sls slsVar;
        sls slsVar2;
        sls slsVar3;
        sls slsVar4;
        cnq0 cnq0Var;
        sls slsVar5;
        cnq0 cnq0Var2;
        float intBitsToFloat;
        sls slsVar6;
        sls slsVar7;
        sls slsVar8;
        sls slsVar9;
        sls slsVar10;
        sls slsVar11;
        tls tlsVar;
        ag agVar;
        tls tlsVar2;
        sls slsVar12;
        sls slsVar13;
        sls slsVar14;
        sls slsVar15;
        sls slsVar16;
        CharSequence charSequence;
        List list;
        Float valueOf = Float.valueOf(0.0f);
        jnq0 jnq0Var = (jnq0) getCurrentSemanticsNodes().b(virtualViewId);
        if (jnq0Var == null || (cVar = jnq0Var.a) == null) {
            return false;
        }
        cnq0 cnq0Var3 = cVar.d;
        hz40 hz40Var = cnq0Var3.a;
        Object a = androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.o);
        Boolean bool = Boolean.TRUE;
        if (jl40.l(a, bool) && !isRequestFromAccessibilityTool()) {
            return false;
        }
        if (action == 64) {
            return requestAccessibilityFocus(virtualViewId);
        }
        if (action == 128) {
            return clearAccessibilityFocus(virtualViewId);
        }
        boolean z = true;
        if (action == 256 || action == 512) {
            if (arguments != null) {
                return traverseAtGranularity(cVar, arguments.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), action == 256, arguments.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
            }
            return false;
        }
        if (action == 16384) {
            ag agVar2 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.q);
            if (agVar2 == null || (slsVar = (sls) agVar2.a()) == null) {
                return false;
            }
            return ((Boolean) slsVar.invoke()).booleanValue();
        }
        if (action == 131072) {
            boolean accessibilitySelection = setAccessibilitySelection(cVar, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (accessibilitySelection) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(cVar.f), 0, null, null, 12, null);
            }
            return accessibilitySelection;
        }
        if (!dai0.a(cVar)) {
            return false;
        }
        if (action == 1) {
            if (this.view.isInTouchMode()) {
                this.view.requestFocusFromTouch();
            }
            ag agVar3 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.w);
            if (agVar3 == null || (slsVar2 = (sls) agVar3.a()) == null) {
                return false;
            }
            return ((Boolean) slsVar2.invoke()).booleanValue();
        }
        if (action == 2) {
            if (!jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.l), bool)) {
                return false;
            }
            ((androidx.compose.ui.focus.c) this.view.getFocusOwner()).d(8, false, true);
            return true;
        }
        Boolean bool2 = null;
        bool2 = null;
        switch (action) {
            case 16:
                ag agVar4 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.b);
                if (agVar4 != null && (slsVar3 = (sls) agVar4.a()) != null) {
                    bool2 = (Boolean) slsVar3.invoke();
                }
                sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                ag agVar5 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.c);
                if (agVar5 == null || (slsVar4 = (sls) agVar5.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar4.invoke()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                ag agVar6 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.s);
                if (agVar6 == null || (slsVar7 = (sls) agVar6.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar7.invoke()).booleanValue();
            case 65536:
                ag agVar7 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.r);
                if (agVar7 == null || (slsVar8 = (sls) agVar7.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar8.invoke()).booleanValue();
            case 262144:
                ag agVar8 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.t);
                if (agVar8 == null || (slsVar9 = (sls) agVar8.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar9.invoke()).booleanValue();
            case 524288:
                ag agVar9 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.u);
                if (agVar9 == null || (slsVar10 = (sls) agVar9.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar10.invoke()).booleanValue();
            case 1048576:
                ag agVar10 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.v);
                if (agVar10 == null || (slsVar11 = (sls) agVar10.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar11.invoke()).booleanValue();
            case 2097152:
                String string = arguments != null ? arguments.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                ag agVar11 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.k);
                if (agVar11 == null || (tlsVar = (tls) agVar11.a()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) tlsVar.invoke(new kk2(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                return scrollOntoScreen(cVar);
            case R.id.accessibilityActionSetProgress:
                if (arguments == null || !arguments.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.i)) == null || (tlsVar2 = (tls) agVar.a()) == null) {
                    return false;
                }
                return ((Boolean) tlsVar2.invoke(Float.valueOf(arguments.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                ag agVar12 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.p);
                if (agVar12 == null || (slsVar12 = (sls) agVar12.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar12.invoke()).booleanValue();
            default:
                switch (action) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (action) {
                            case R.id.accessibilityActionPageUp:
                                ag agVar13 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.y);
                                if (agVar13 == null || (slsVar13 = (sls) agVar13.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) slsVar13.invoke()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                ag agVar14 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.A);
                                if (agVar14 == null || (slsVar14 = (sls) agVar14.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) slsVar14.invoke()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                ag agVar15 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.z);
                                if (agVar15 == null || (slsVar15 = (sls) agVar15.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) slsVar15.invoke()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                ag agVar16 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.B);
                                if (agVar16 == null || (slsVar16 = (sls) agVar16.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) slsVar16.invoke()).booleanValue();
                            default:
                                pnt0 pnt0Var = (pnt0) this.actionIdToLabel.b(virtualViewId);
                                if (pnt0Var == null || (charSequence = (CharSequence) pnt0Var.b(action)) == null || (list = (List) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.x)) == null) {
                                    return false;
                                }
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    nif nifVar = (nif) list.get(i);
                                    if (jl40.l(nifVar.b(), charSequence)) {
                                        return ((Boolean) nifVar.a().invoke()).booleanValue();
                                    }
                                }
                                return false;
                        }
                }
        }
        boolean z2 = action == 4096;
        boolean z3 = action == 8192;
        boolean z4 = action == 16908345;
        boolean z5 = action == 16908347;
        boolean z6 = action == 16908344;
        boolean z7 = action == 16908346;
        boolean z8 = z4 || z5 || z2 || z3;
        if (!z6 && !z7 && !z2 && !z3) {
            z = false;
        }
        if (z2 || z3) {
            cif0 cif0Var = (cif0) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.c);
            ag agVar17 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.i);
            if (cif0Var != null && agVar17 != null) {
                float floatValue = Float.valueOf(((r5c) cif0Var.b()).b).floatValue();
                float floatValue2 = Float.valueOf(((r5c) cif0Var.b()).a).floatValue();
                if (floatValue < floatValue2) {
                    floatValue = floatValue2;
                }
                float floatValue3 = Float.valueOf(((r5c) cif0Var.b()).a).floatValue();
                float floatValue4 = Float.valueOf(((r5c) cif0Var.b()).b).floatValue();
                if (floatValue3 > floatValue4) {
                    floatValue3 = floatValue4;
                }
                float f = (floatValue - floatValue3) / 20.0f;
                if (z3) {
                    f = -f;
                }
                tls tlsVar3 = (tls) agVar17.a();
                if (tlsVar3 != null) {
                    return ((Boolean) tlsVar3.invoke(Float.valueOf(cif0Var.a() + f))).booleanValue();
                }
                return false;
            }
        }
        long d = gwk0.i((androidx.compose.ui.node.f) cVar.c.a0.d).d();
        Float e = m9b1.e(cnq0Var3);
        ag agVar18 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.a.d);
        if (agVar18 == null) {
            return false;
        }
        bhp0 bhp0Var = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.v);
        if (bhp0Var == null || !z8) {
            cnq0Var = cnq0Var3;
        } else {
            if (e != null) {
                intBitsToFloat = e.floatValue();
                cnq0Var2 = cnq0Var3;
            } else {
                cnq0Var2 = cnq0Var3;
                intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
            }
            if (z4 || z3) {
                intBitsToFloat = -intBitsToFloat;
            }
            if (dai0.b(cVar) && (z4 || z5)) {
                intBitsToFloat = -intBitsToFloat;
            }
            if (performActionHelper$canScroll(bhp0Var, intBitsToFloat)) {
                androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.a.z;
                if (!hz40Var.b(gVar) && !hz40Var.b(androidx.compose.ui.semantics.a.B)) {
                    wls wlsVar = (wls) agVar18.a();
                    if (wlsVar != null) {
                        return ((Boolean) wlsVar.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                    }
                    return false;
                }
                ag agVar19 = intBitsToFloat > 0.0f ? (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.B) : (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, gVar);
                if (agVar19 == null || (slsVar6 = (sls) agVar19.a()) == null) {
                    return false;
                }
                return ((Boolean) slsVar6.invoke()).booleanValue();
            }
            cnq0Var = cnq0Var2;
        }
        bhp0 bhp0Var2 = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.w);
        if (bhp0Var2 == null || !z) {
            return false;
        }
        float floatValue5 = e != null ? e.floatValue() : Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & d));
        if (z6 || z3) {
            floatValue5 = -floatValue5;
        }
        if (!performActionHelper$canScroll(bhp0Var2, floatValue5)) {
            return false;
        }
        androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.a.y;
        if (!hz40Var.b(gVar2) && !hz40Var.b(androidx.compose.ui.semantics.a.A)) {
            wls wlsVar2 = (wls) agVar18.a();
            if (wlsVar2 != null) {
                return ((Boolean) wlsVar2.invoke(valueOf, Float.valueOf(floatValue5))).booleanValue();
            }
            return false;
        }
        ag agVar20 = floatValue5 > 0.0f ? (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.A) : (ag) androidx.compose.ui.semantics.b.a(cnq0Var, gVar2);
        if (agVar20 == null || (slsVar5 = (sls) agVar20.a()) == null) {
            return false;
        }
        return ((Boolean) slsVar5.invoke()).booleanValue();
    }

    private static final boolean performActionHelper$canScroll(bhp0 bhp0Var, float f) {
        if (f >= 0.0f || ((Number) bhp0Var.b().invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) bhp0Var.b().invoke()).floatValue() < ((Number) bhp0Var.a().invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0438, code lost:
    
        if ((r8 != null ? defpackage.jl40.l(androidx.compose.ui.semantics.b.a(r8, r9), r12) : false) == false) goto L206;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void populateAccessibilityNodeInfoProperties(int virtualViewId, wh info, androidx.compose.ui.semantics.c semanticsNode) {
        int i;
        int i2;
        boolean z;
        int i3;
        bhp0 bhp0Var;
        bhp0 bhp0Var2;
        cnq0 cnq0Var;
        int e;
        int e2;
        String str;
        AndroidViewHolder g;
        qy40 qy40Var;
        int i4;
        ag agVar;
        ag agVar2;
        ag agVar3;
        ag agVar4;
        ag agVar5;
        int e3;
        boolean z2;
        androidx.compose.ui.semantics.c cVar;
        Resources resources = this.view.getContext().getResources();
        info.p(ClassName);
        AccessibilityNodeInfo accessibilityNodeInfo = info.a;
        cnq0 cnq0Var2 = semanticsNode.d;
        hz40 hz40Var = cnq0Var2.a;
        if (cnq0Var2.a.b(androidx.compose.ui.semantics.d.G)) {
            info.p(TextFieldClassName);
        }
        if (hz40Var.b(androidx.compose.ui.semantics.d.C)) {
            info.p(TextClassName);
        }
        awk0 awk0Var = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.z);
        if (awk0Var != null) {
            int i5 = awk0Var.a;
            if (semanticsNode.o() || androidx.compose.ui.semantics.c.j(semanticsNode, 4).isEmpty()) {
                if (i5 == 4) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(hzh0.tab));
                } else if (i5 == 2) {
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(hzh0.switch_role));
                } else {
                    String h = m9b1.h(i5);
                    if (i5 != 5 || semanticsNode.q() || cnq0Var2.c) {
                        info.p(h);
                    }
                }
            }
        }
        info.z(this.view.getContext().getPackageName());
        accessibilityNodeInfo.setImportantForAccessibility(cvw.Q(semanticsNode));
        boolean isRequestFromAccessibilityTool = isRequestFromAccessibilityTool();
        List j = androidx.compose.ui.semantics.c.j(semanticsNode, 4);
        int size = j.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            androidx.compose.ui.semantics.c cVar2 = (androidx.compose.ui.semantics.c) j.get(i7);
            x5w currentSemanticsNodes = getCurrentSemanticsNodes();
            boolean z3 = isRequestFromAccessibilityTool;
            int i8 = cVar2.f;
            if (currentSemanticsNodes.a(i8)) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(cVar2.c);
                if (i8 != -1) {
                    if (androidViewHolder != null) {
                        accessibilityNodeInfo.addChild(androidViewHolder);
                    } else {
                        jnq0 jnq0Var = (jnq0) getCurrentSemanticsNodes().b(i8);
                        boolean l = (jnq0Var == null || (cVar = jnq0Var.a) == null) ? false : jl40.l(androidx.compose.ui.semantics.b.a(cVar.k(), androidx.compose.ui.semantics.d.o), Boolean.TRUE);
                        if (z3 || !l) {
                            accessibilityNodeInfo.addChild(this.view, i8);
                        }
                    }
                    this.drawingOrder.g(i8, i6);
                    i6++;
                }
            }
            i7++;
            isRequestFromAccessibilityTool = z3;
        }
        if (virtualViewId == this.accessibilityFocusedVirtualViewId) {
            info.j(true);
            info.b(ph.j);
        } else {
            info.j(false);
            info.b(ph.i);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        info.D(dai0.s(semanticsNode, resources));
        info.m(dai0.r(semanticsNode));
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.K);
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.o(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.o(false);
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.J);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (awk0Var == null) {
                i = 4;
            } else {
                i = 4;
                if (awk0Var.a == 4) {
                    info.C(booleanValue);
                }
            }
            info.o(booleanValue);
        } else {
            i = 4;
        }
        if (!cnq0Var2.c || androidx.compose.ui.semantics.c.j(semanticsNode, i).isEmpty()) {
            List list = (List) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.a);
            info.t(list != null ? (String) kotlin.collections.a.R(list) : null);
        }
        String str2 = (String) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.A);
        if (str2 != null) {
            androidx.compose.ui.semantics.c cVar3 = semanticsNode;
            while (true) {
                if (cVar3 == null) {
                    z2 = false;
                    break;
                }
                cnq0 cnq0Var3 = cVar3.d;
                androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.e.a;
                if (cnq0Var3.a.b(gVar)) {
                    z2 = ((Boolean) cnq0Var3.d(gVar)).booleanValue();
                    break;
                }
                cVar3 = cVar3.l();
            }
            if (z2) {
                accessibilityNodeInfo.setViewIdResourceName(str2);
            }
        }
        if (((zy11) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.h)) != null) {
            accessibilityNodeInfo.setHeading(true);
        }
        if (((zy11) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.i)) != null) {
            accessibilityNodeInfo.setTextEntryKey(true);
        }
        if (virtualViewId != -1 && (e3 = this.drawingOrder.e(semanticsNode.f)) != -1) {
            accessibilityNodeInfo.setDrawingOrder(e3);
        }
        accessibilityNodeInfo.setPassword(hz40Var.b(androidx.compose.ui.semantics.d.L));
        Object a = androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.O);
        Boolean bool2 = Boolean.TRUE;
        accessibilityNodeInfo.setEditable(jl40.l(a, bool2));
        Integer num = (Integer) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.P);
        accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
        info.v(dai0.a(semanticsNode));
        androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.d.l;
        info.w(hz40Var.b(gVar2));
        if (accessibilityNodeInfo.isFocusable()) {
            accessibilityNodeInfo.setFocused(((Boolean) cnq0Var2.d(gVar2)).booleanValue());
            if (accessibilityNodeInfo.isFocused()) {
                i2 = 2;
                info.a(2);
                this.focusedVirtualViewId = virtualViewId;
            } else {
                i2 = 2;
                info.a(1);
            }
        } else {
            i2 = 2;
        }
        info.G(!cvw.P(semanticsNode));
        setInvisibleIfEmptyBounds(info, semanticsNode.o() ? semanticsNode.l() : semanticsNode);
        fwy fwyVar = (fwy) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.k);
        if (fwyVar != null) {
            int b = fwyVar.b();
            z = false;
            if (fwy.a(b, 0) || !fwy.a(b, 1)) {
                i2 = 1;
            }
            accessibilityNodeInfo.setLiveRegion(i2);
        } else {
            z = false;
        }
        info.q(z);
        ag agVar6 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.b);
        if (agVar6 != null) {
            boolean l2 = jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.J), bool2);
            boolean z4 = (awk0Var != null && awk0Var.a == 4) || (awk0Var != null && awk0Var.a == 3);
            info.q(!z4 || (z4 && !l2));
            if (dai0.a(semanticsNode) && accessibilityNodeInfo.isClickable()) {
                info.b(new ph(16, agVar6.b()));
            }
        }
        info.y(false);
        ag agVar7 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.c);
        if (agVar7 != null) {
            info.y(true);
            if (dai0.a(semanticsNode)) {
                info.b(new ph(32, agVar7.b()));
            }
        }
        ag agVar8 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.q);
        if (agVar8 != null) {
            info.b(new ph(16384, agVar8.b()));
        }
        if (dai0.a(semanticsNode)) {
            ag agVar9 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.k);
            if (agVar9 != null) {
                info.b(new ph(2097152, agVar9.b()));
            }
            ag agVar10 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.p);
            if (agVar10 != null) {
                info.b(new ph(R.id.accessibilityActionImeEnter, agVar10.b()));
            }
            ag agVar11 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.r);
            if (agVar11 != null) {
                info.b(new ph(65536, agVar11.b()));
            }
            ag agVar12 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.s);
            if (agVar12 != null && accessibilityNodeInfo.isFocused()) {
                ClipDescription primaryClipDescription = this.view.getClipboardManager().a().getPrimaryClipDescription();
                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                    info.b(new ph(32768, agVar12.b()));
                }
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            accessibilityNodeInfo.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            ag agVar13 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.j);
            info.b(new ph(131072, agVar13 != null ? agVar13.b() : null));
            info.a(256);
            info.a(512);
            accessibilityNodeInfo.setMovementGranularities(11);
            List list2 = (List) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.a);
            if ((list2 == null || list2.isEmpty()) && hz40Var.b(androidx.compose.ui.semantics.a.a) && (!hz40Var.b(androidx.compose.ui.semantics.d.G) || jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var2, gVar2), bool2))) {
                LayoutNode m = dai0.m(semanticsNode.c, AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.w);
                if (m != null) {
                    cnq0 u = m.u();
                }
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExtraDataIdKey);
        CharSequence g2 = info.g();
        if (g2 != null && g2.length() != 0 && hz40Var.b(androidx.compose.ui.semantics.a.a)) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (hz40Var.b(androidx.compose.ui.semantics.d.A)) {
            arrayList.add(ExtraDataTestTagKey);
        }
        if (hz40Var.b(androidx.compose.ui.semantics.d.Q)) {
            arrayList.add(ExtraDataShapeTypeKey);
            arrayList.add(ExtraDataShapeRectKey);
            arrayList.add(ExtraDataShapeRectCornersKey);
            arrayList.add(ExtraDataShapeRegionKey);
        }
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
        cif0 cif0Var = (cif0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.c);
        if (cif0Var != null) {
            androidx.compose.ui.semantics.g gVar3 = androidx.compose.ui.semantics.a.i;
            if (hz40Var.b(gVar3)) {
                info.p("android.widget.SeekBar");
            } else {
                info.p("android.widget.ProgressBar");
            }
            cif0 cif0Var2 = cif0.c;
            if (cif0Var != a8a1.k()) {
                accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) vh.a(Float.valueOf(((r5c) cif0Var.b()).a).floatValue(), Float.valueOf(((r5c) cif0Var.b()).b).floatValue(), cif0Var.a(), 1).a);
            }
            if (hz40Var.b(gVar3) && dai0.a(semanticsNode)) {
                float a2 = cif0Var.a();
                float floatValue = Float.valueOf(((r5c) cif0Var.b()).b).floatValue();
                float floatValue2 = Float.valueOf(((r5c) cif0Var.b()).a).floatValue();
                if (floatValue < floatValue2) {
                    floatValue = floatValue2;
                }
                if (a2 < floatValue) {
                    info.b(ph.k);
                }
                float a3 = cif0Var.a();
                float floatValue3 = Float.valueOf(((r5c) cif0Var.b()).a).floatValue();
                float floatValue4 = Float.valueOf(((r5c) cif0Var.b()).b).floatValue();
                if (floatValue3 > floatValue4) {
                    floatValue3 = floatValue4;
                }
                if (a3 > floatValue3) {
                    info.b(ph.l);
                }
            }
        }
        if (dai0.a(semanticsNode) && (agVar5 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.i)) != null) {
            info.b(new ph(R.id.accessibilityActionSetProgress, agVar5.b()));
        }
        hcc hccVar = (hcc) androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.f);
        if (hccVar != null) {
            info.r(th.a(hccVar.b(), hccVar.a(), 0, false));
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.e) != null) {
                List j2 = androidx.compose.ui.semantics.c.j(semanticsNode, 4);
                int size2 = j2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    androidx.compose.ui.semantics.c cVar4 = (androidx.compose.ui.semantics.c) j2.get(i9);
                    if (cVar4.k().a.b(androidx.compose.ui.semantics.d.J)) {
                        arrayList2.add(cVar4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                boolean a4 = androidx.compose.ui.platform.accessibility.a.a(arrayList2);
                i3 = 0;
                info.r(th.a(a4 ? 1 : arrayList2.size(), a4 ? arrayList2.size() : 1, 0, false));
                androidx.compose.ui.platform.accessibility.a.b(semanticsNode, info);
                bhp0Var = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.v);
                ag agVar14 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.d);
                if (bhp0Var != null && agVar14 != null) {
                    if (androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.f) == null && androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.e) == null) {
                        info.p("android.widget.HorizontalScrollView");
                    }
                    if (((Number) bhp0Var.a().invoke()).floatValue() > 0.0f) {
                        info.B(true);
                    }
                    if (dai0.a(semanticsNode)) {
                        if (populateAccessibilityNodeInfoProperties$canScrollForward(bhp0Var)) {
                            info.b(ph.k);
                            info.b(!dai0.b(semanticsNode) ? ph.t : ph.r);
                        }
                        if (populateAccessibilityNodeInfoProperties$canScrollBackward(bhp0Var)) {
                            info.b(ph.l);
                            info.b(!dai0.b(semanticsNode) ? ph.r : ph.t);
                        }
                    }
                }
                bhp0Var2 = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.w);
                if (bhp0Var2 != null && agVar14 != null) {
                    if (androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.f) == null && androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.e) == null) {
                        info.p("android.widget.ScrollView");
                    }
                    if (((Number) bhp0Var2.a().invoke()).floatValue() > 0.0f) {
                        info.B(true);
                    }
                    if (dai0.a(semanticsNode)) {
                        if (populateAccessibilityNodeInfoProperties$canScrollForward(bhp0Var2)) {
                            info.b(ph.k);
                            info.b(ph.s);
                        }
                        if (populateAccessibilityNodeInfoProperties$canScrollBackward(bhp0Var2)) {
                            info.b(ph.l);
                            info.b(ph.q);
                        }
                    }
                }
                cnq0Var = semanticsNode.d;
                awk0 awk0Var2 = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.z);
                if (dai0.a(semanticsNode) && (awk0Var2 == null || awk0Var2.a != 8)) {
                    agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.y);
                    if (agVar != null) {
                        info.b(new ph(R.id.accessibilityActionPageUp, agVar.b()));
                    }
                    agVar2 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.A);
                    if (agVar2 != null) {
                        info.b(new ph(R.id.accessibilityActionPageDown, agVar2.b()));
                    }
                    agVar3 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.z);
                    if (agVar3 != null) {
                        info.b(new ph(R.id.accessibilityActionPageLeft, agVar3.b()));
                    }
                    agVar4 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.B);
                    if (agVar4 != null) {
                        info.b(new ph(R.id.accessibilityActionPageRight, agVar4.b()));
                    }
                }
                accessibilityNodeInfo.setPaneTitle((CharSequence) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.d));
                if (dai0.a(semanticsNode)) {
                    ag agVar15 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.t);
                    if (agVar15 != null) {
                        info.b(new ph(262144, agVar15.b()));
                    }
                    ag agVar16 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.u);
                    if (agVar16 != null) {
                        info.b(new ph(524288, agVar16.b()));
                    }
                    ag agVar17 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.v);
                    if (agVar17 != null) {
                        info.b(new ph(1048576, agVar17.b()));
                    }
                    androidx.compose.ui.semantics.g gVar4 = androidx.compose.ui.semantics.a.x;
                    if (hz40Var.b(gVar4)) {
                        List list3 = (List) cnq0Var2.d(gVar4);
                        int size3 = list3.size();
                        u5w u5wVar = AccessibilityActionsResourceIds;
                        if (size3 >= u5wVar.b) {
                            ny61.r(oyr.m(u5wVar.b, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                            return;
                        }
                        pnt0 pnt0Var = new pnt0((Object) null);
                        qy40 a5 = kp60.a();
                        pnt0 pnt0Var2 = this.labelToActionId;
                        if (pnt0Var2.a) {
                            kp50.a(pnt0Var2);
                        }
                        if (cvw.c(pnt0Var2.b, pnt0Var2.w, virtualViewId) >= 0) {
                            qy40 qy40Var2 = (qy40) this.labelToActionId.b(virtualViewId);
                            vx40 vx40Var = new vx40((Object) null);
                            int[] iArr = u5wVar.a;
                            int i10 = u5wVar.b;
                            for (int i11 = i3; i11 < i10; i11++) {
                                vx40Var.c(iArr[i11]);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int size4 = list3.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                nif nifVar = (nif) list3.get(i12);
                                int i13 = size4;
                                if (qy40Var2.d(nifVar.b()) >= 0) {
                                    String b2 = nifVar.b();
                                    int d = qy40Var2.d(b2);
                                    if (d < 0) {
                                        xva1.e("There is no key " + ((Object) b2) + " in the map");
                                        throw null;
                                    }
                                    int i14 = qy40Var2.c[d];
                                    qy40Var = qy40Var2;
                                    pnt0Var.d(i14, nifVar.b());
                                    a5.g(nifVar.b(), i14);
                                    int[] iArr2 = vx40Var.a;
                                    int i15 = vx40Var.b;
                                    i4 = i12;
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= i15) {
                                            i16 = -1;
                                            break;
                                        }
                                        int i17 = i15;
                                        if (i14 == iArr2[i16]) {
                                            break;
                                        }
                                        i16++;
                                        i15 = i17;
                                    }
                                    if (i16 >= 0) {
                                        vx40Var.e(i16);
                                    }
                                    info.b(new ph(i14, nifVar.b()));
                                } else {
                                    qy40Var = qy40Var2;
                                    i4 = i12;
                                    arrayList3.add(nifVar);
                                }
                                i12 = i4 + 1;
                                size4 = i13;
                                qy40Var2 = qy40Var;
                            }
                            int size5 = arrayList3.size();
                            for (int i18 = 0; i18 < size5; i18++) {
                                nif nifVar2 = (nif) arrayList3.get(i18);
                                int a6 = vx40Var.a(i18);
                                pnt0Var.d(a6, nifVar2.b());
                                a5.g(nifVar2.b(), a6);
                                info.b(new ph(a6, nifVar2.b()));
                            }
                        } else {
                            int size6 = list3.size();
                            for (int i19 = 0; i19 < size6; i19++) {
                                nif nifVar3 = (nif) list3.get(i19);
                                int a7 = AccessibilityActionsResourceIds.a(i19);
                                pnt0Var.d(a7, nifVar3.b());
                                a5.g(nifVar3.b(), a7);
                                info.b(new ph(a7, nifVar3.b()));
                            }
                        }
                        this.actionIdToLabel.d(virtualViewId, pnt0Var);
                        this.labelToActionId.d(virtualViewId, a5);
                    }
                }
                accessibilityNodeInfo.setScreenReaderFocusable(dai0.c(semanticsNode, resources));
                e = this.idToBeforeMap.e(virtualViewId);
                if (e != -1) {
                    AndroidViewHolder g3 = m9b1.g(this.view.getAndroidViewsHandler$ui(), e);
                    if (g3 != null) {
                        accessibilityNodeInfo.setTraversalBefore(g3);
                    } else {
                        accessibilityNodeInfo.setTraversalBefore(this.view, e);
                    }
                    addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
                }
                e2 = this.idToAfterMap.e(virtualViewId);
                if (e2 != -1 && (g = m9b1.g(this.view.getAndroidViewsHandler$ui(), e2)) != null) {
                    info.F(g);
                    addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
                }
                str = (String) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.e.b);
                if (str == null) {
                    info.p(str);
                    return;
                }
                return;
            }
        }
        i3 = 0;
        androidx.compose.ui.platform.accessibility.a.b(semanticsNode, info);
        bhp0Var = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.v);
        ag agVar142 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.a.d);
        if (bhp0Var != null) {
            if (androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.f) == null) {
                info.p("android.widget.HorizontalScrollView");
            }
            if (((Number) bhp0Var.a().invoke()).floatValue() > 0.0f) {
            }
            if (dai0.a(semanticsNode)) {
            }
        }
        bhp0Var2 = (bhp0) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.w);
        if (bhp0Var2 != null) {
            if (androidx.compose.ui.semantics.b.a(semanticsNode.k(), androidx.compose.ui.semantics.d.f) == null) {
                info.p("android.widget.ScrollView");
            }
            if (((Number) bhp0Var2.a().invoke()).floatValue() > 0.0f) {
            }
            if (dai0.a(semanticsNode)) {
            }
        }
        cnq0Var = semanticsNode.d;
        awk0 awk0Var22 = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.d.z);
        if (dai0.a(semanticsNode)) {
            agVar = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.y);
            if (agVar != null) {
            }
            agVar2 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.A);
            if (agVar2 != null) {
            }
            agVar3 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.z);
            if (agVar3 != null) {
            }
            agVar4 = (ag) androidx.compose.ui.semantics.b.a(cnq0Var, androidx.compose.ui.semantics.a.B);
            if (agVar4 != null) {
            }
        }
        accessibilityNodeInfo.setPaneTitle((CharSequence) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.d.d));
        if (dai0.a(semanticsNode)) {
        }
        accessibilityNodeInfo.setScreenReaderFocusable(dai0.c(semanticsNode, resources));
        e = this.idToBeforeMap.e(virtualViewId);
        if (e != -1) {
        }
        e2 = this.idToAfterMap.e(virtualViewId);
        if (e2 != -1) {
            info.F(g);
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
        }
        str = (String) androidx.compose.ui.semantics.b.a(cnq0Var2, androidx.compose.ui.semantics.e.b);
        if (str == null) {
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(bhp0 bhp0Var) {
        if (((Number) bhp0Var.b().invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) bhp0Var.b().invoke()).floatValue();
        ((Number) bhp0Var.a().invoke()).floatValue();
        return false;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(bhp0 bhp0Var) {
        if (((Number) bhp0Var.b().invoke()).floatValue() < ((Number) bhp0Var.a().invoke()).floatValue()) {
            return true;
        }
        ((Number) bhp0Var.b().invoke()).floatValue();
        return false;
    }

    private final boolean registerScrollingId(int id, List<bip0> oldScrollObservationScopes) {
        boolean z;
        bip0 c = m9b1.c(id, oldScrollObservationScopes);
        if (c != null) {
            z = false;
        } else {
            c = new bip0(id, this.scrollObservationScopes);
            z = true;
        }
        this.scrollObservationScopes.add(c);
        return z;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i = this.accessibilityFocusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final bip0 scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            androidx.compose.ui.node.w snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.a.c(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new sls(this) { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    x5w currentSemanticsNodes;
                    int i;
                    x5w currentSemanticsNodes2;
                    int i2;
                    x5w currentSemanticsNodes3;
                    androidx.compose.ui.semantics.c cVar;
                    LayoutNode layoutNode;
                    wx40 wx40Var;
                    wx40 wx40Var2;
                    wh whVar;
                    Rect boundsInScreen;
                    wh whVar2;
                    Rect boundsInScreen2;
                    bip0 bip0Var = scrollObservationScope;
                    bhp0 bhp0Var = bip0Var.x;
                    bhp0 bhp0Var2 = bip0Var.y;
                    Float f = bip0Var.c;
                    Float f2 = bip0Var.w;
                    float floatValue = (bhp0Var == null || f == null) ? 0.0f : ((Number) bhp0Var.a.invoke()).floatValue() - f.floatValue();
                    float floatValue2 = (bhp0Var2 == null || f2 == null) ? 0.0f : ((Number) bhp0Var2.a.invoke()).floatValue() - f2.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.a);
                        currentSemanticsNodes = this.this$0.getCurrentSemanticsNodes();
                        i = this.this$0.accessibilityFocusedVirtualViewId;
                        jnq0 jnq0Var = (jnq0) currentSemanticsNodes.b(i);
                        if (jnq0Var != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                            try {
                                whVar2 = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (whVar2 != null) {
                                    boundsInScreen2 = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(jnq0Var);
                                    whVar2.l(boundsInScreen2);
                                }
                            } catch (IllegalStateException unused) {
                            }
                        }
                        currentSemanticsNodes2 = this.this$0.getCurrentSemanticsNodes();
                        i2 = this.this$0.focusedVirtualViewId;
                        jnq0 jnq0Var2 = (jnq0) currentSemanticsNodes2.b(i2);
                        if (jnq0Var2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                            try {
                                whVar = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (whVar != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(jnq0Var2);
                                    whVar.l(boundsInScreen);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                        }
                        this.this$0.getView().invalidate();
                        currentSemanticsNodes3 = this.this$0.getCurrentSemanticsNodes();
                        jnq0 jnq0Var3 = (jnq0) currentSemanticsNodes3.b(semanticsNodeIdToAccessibilityVirtualNodeId);
                        if (jnq0Var3 != null && (cVar = jnq0Var3.a) != null && (layoutNode = cVar.c) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.this$0;
                            if (bhp0Var != null) {
                                wx40Var2 = androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents;
                                wx40Var2.i(semanticsNodeIdToAccessibilityVirtualNodeId, bhp0Var);
                            }
                            if (bhp0Var2 != null) {
                                wx40Var = androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents;
                                wx40Var.i(semanticsNodeIdToAccessibilityVirtualNodeId, bhp0Var2);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (bhp0Var != null) {
                        scrollObservationScope.c = (Float) bhp0Var.a.invoke();
                    }
                    if (bhp0Var2 != null) {
                        scrollObservationScope.w = (Float) bhp0Var2.a.invoke();
                    }
                    return zy11.a;
                }
            });
        }
    }

    /* renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    private final long m76scrollDxDyForNodeVisibleRE3cj74(androidx.compose.ui.semantics.c cVar, androidx.compose.ui.semantics.c cVar2, long j) {
        zii0 i = gwk0.i((androidx.compose.ui.node.f) cVar2.c.a0.d);
        rzx q = ((androidx.compose.ui.node.f) cVar2.c.a0.d).q();
        zii0 j2 = i.j(q != null ? ((androidx.compose.ui.node.s) q).v(0L) : 0L);
        long f = wu60.f(cVar.m(), j);
        androidx.compose.ui.node.s d = cVar.d();
        zii0 b = wwg.b(f, rzo.a0(d != null ? d.c : 0L));
        return (Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(b.a - j2.a, b.c - j2.c)) << 32) | (Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(b.b - j2.b, b.d - j2.d)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0013, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean scrollOntoScreen(androidx.compose.ui.semantics.c cVar) {
        ag agVar;
        androidx.compose.ui.semantics.c l = cVar.l();
        if (l != null) {
            agVar = (ag) androidx.compose.ui.semantics.b.a(l.d, androidx.compose.ui.semantics.a.d);
            while (agVar == null && l != null) {
                l = l.l();
                if (l != null) {
                    agVar = (ag) androidx.compose.ui.semantics.b.a(l.d, androidx.compose.ui.semantics.a.d);
                }
            }
            if (l == null) {
                zii0 g = cVar.g();
                return this.view.requestRectangleOnScreen(new Rect((int) Math.floor(g.a), (int) Math.floor(g.b), m810.b((float) Math.ceil(g.c)), m810.b((float) Math.ceil(g.d))));
            }
            long j = 0;
            boolean z = false;
            while (l != null) {
                ag agVar2 = (ag) androidx.compose.ui.semantics.b.a(l.d, androidx.compose.ui.semantics.a.d);
                if (agVar2 != null) {
                    long m76scrollDxDyForNodeVisibleRE3cj74 = m76scrollDxDyForNodeVisibleRE3cj74(cVar, l, j);
                    long m73adjustForReversedScrollingAndRtlRE3cj74 = m73adjustForReversedScrollingAndRtlRE3cj74(cVar, l, m76scrollDxDyForNodeVisibleRE3cj74);
                    wls wlsVar = (wls) agVar2.a();
                    z = (wlsVar != null && ((Boolean) wlsVar.invoke(Float.valueOf(Float.intBitsToFloat((int) (m73adjustForReversedScrollingAndRtlRE3cj74 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (m73adjustForReversedScrollingAndRtlRE3cj74 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))))).booleanValue()) || z;
                    j = wu60.e(j, m76scrollDxDyForNodeVisibleRE3cj74);
                }
                l = l.l();
            }
            return z;
        }
        agVar = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            androidComposeViewAccessibilityDelegateCompat.view.measureAndLayout(true);
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().a().f) {
            return -1;
        }
        return id;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.c newNode, inq0 oldNode) {
        int[] iArr = i6w.a;
        xx40 xx40Var = new xx40((Object) null);
        newNode.getClass();
        List j = androidx.compose.ui.semantics.c.j(newNode, 4);
        LayoutNode layoutNode = newNode.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.c cVar = (androidx.compose.ui.semantics.c) j.get(i);
            x5w currentSemanticsNodes = getCurrentSemanticsNodes();
            int i2 = cVar.f;
            if (currentSemanticsNodes.a(i2)) {
                if (!oldNode.b.c(i2)) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                    return;
                }
                xx40Var.a(i2);
            }
        }
        xx40 xx40Var2 = oldNode.b;
        int[] iArr2 = xx40Var2.b;
        long[] jArr = xx40Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !xx40Var.c(iArr2[(i3 << 3) + i5])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List j3 = androidx.compose.ui.semantics.c.j(newNode, 4);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            androidx.compose.ui.semantics.c cVar2 = (androidx.compose.ui.semantics.c) j3.get(i6);
            inq0 inq0Var = (inq0) this.previousSemanticsNodes.b(cVar2.f);
            if (inq0Var != null && getCurrentSemanticsNodes().a(cVar2.f)) {
                sendAccessibilitySemanticsStructureChangeEvents(cVar2, inq0Var);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(event)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            createEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            createEvent.setContentDescription(rty.a(62, null, ",", contentDescription));
        }
        return sendEvent(createEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        createEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            createEvent.getText().add(title);
        }
        sendEvent(createEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        m82 m82Var = this.pendingTextTraversedEvent;
        if (m82Var != null) {
            if (semanticsNodeId != m82Var.d().f) {
                return;
            }
            if (SystemClock.uptimeMillis() - m82Var.f() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(m82Var.d().f), 131072);
                createEvent.setFromIndex(m82Var.b());
                createEvent.setToIndex(m82Var.e());
                createEvent.setAction(m82Var.a());
                createEvent.setMovementGranularity(m82Var.c());
                createEvent.getText().add(getIterableTextForAccessibility(m82Var.d()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0519, code lost:
    
        if (r1.a() != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0526, code lost:
    
        if (r1.a() == null) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSemanticsPropertyChangeEvents(x5w newSemanticsNodes) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        int i4;
        Integer num3;
        int i5;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i6;
        int i7;
        Integer num4;
        int i8;
        int i9;
        boolean z;
        cnq0 cnq0Var;
        boolean z2;
        boolean z3;
        int i10;
        LayoutNode layoutNode;
        cnq0 cnq0Var2;
        int i11;
        hz40 hz40Var;
        int i12;
        LayoutNode layoutNode2;
        int i13;
        int i14;
        int i15;
        int i16;
        Integer num5;
        int i17;
        cnq0 cnq0Var3;
        int i18;
        ArrayList arrayList3;
        int i19;
        Integer num6;
        hz40 hz40Var2;
        int i20;
        cnq0 cnq0Var4;
        hz40 hz40Var3;
        boolean registerScrollingId;
        androidx.compose.ui.semantics.g gVar;
        boolean z4;
        boolean z5;
        String str;
        int i21;
        int i22;
        int i23;
        boolean z6;
        AccessibilityEvent createTextSelectionChangedEvent;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        x5w x5wVar = newSemanticsNodes;
        Integer num7 = 64;
        ArrayList arrayList4 = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr3 = x5wVar.b;
        long[] jArr3 = x5wVar.a;
        int i24 = 2;
        int length = jArr3.length - 2;
        int i25 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j = jArr3[i26];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i27 = 8;
                int i28 = 8 - ((~(i26 - length)) >>> 31);
                long j2 = j;
                int i29 = i25;
                while (i29 < i28) {
                    if ((j2 & 255) < 128) {
                        int i30 = iArr3[(i26 << 3) + i29];
                        inq0 inq0Var = (inq0) androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.b(i30);
                        if (inq0Var == null) {
                            i4 = i29;
                            num3 = num7;
                            i5 = i28;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i6 = i24;
                            i7 = length;
                            num4 = num8;
                            i8 = i26;
                        } else {
                            cnq0 cnq0Var5 = inq0Var.a;
                            i6 = i24;
                            hz40 hz40Var4 = cnq0Var5.a;
                            jnq0 jnq0Var = (jnq0) x5wVar.b(i30);
                            int i31 = i28;
                            androidx.compose.ui.semantics.c cVar = jnq0Var != null ? jnq0Var.a : null;
                            if (cVar == null) {
                                throw x4e.v("no value for specified key");
                            }
                            LayoutNode layoutNode3 = cVar.c;
                            cnq0 cnq0Var6 = cVar.d;
                            int i32 = i27;
                            int i33 = cVar.f;
                            hz40 hz40Var5 = cnq0Var6.a;
                            cnq0 cnq0Var7 = cnq0Var6;
                            Object[] objArr = hz40Var5.b;
                            Object[] objArr2 = hz40Var5.c;
                            long[] jArr4 = hz40Var5.a;
                            i4 = i29;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                Integer num9 = num7;
                                z2 = false;
                                int i34 = 0;
                                while (true) {
                                    long j3 = jArr4[i34];
                                    iArr2 = iArr3;
                                    jArr2 = jArr3;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i34 - length2)) >>> 31);
                                        long j4 = j3;
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j4 & 255) < 128) {
                                                int i37 = (i34 << 3) + i36;
                                                Object obj = objArr[i37];
                                                Object obj2 = objArr2[i37];
                                                androidx.compose.ui.semantics.g gVar2 = (androidx.compose.ui.semantics.g) obj;
                                                int i38 = length2;
                                                androidx.compose.ui.semantics.g gVar3 = androidx.compose.ui.semantics.d.v;
                                                if (jl40.l(gVar2, gVar3)) {
                                                    hz40Var3 = hz40Var5;
                                                } else {
                                                    hz40Var3 = hz40Var5;
                                                    if (!jl40.l(gVar2, androidx.compose.ui.semantics.d.w)) {
                                                        registerScrollingId = false;
                                                        if (!registerScrollingId || !jl40.l(obj2, androidx.compose.ui.semantics.b.a(cnq0Var5, gVar2))) {
                                                            gVar = androidx.compose.ui.semantics.d.d;
                                                            if (jl40.l(gVar2, gVar)) {
                                                                if (jl40.l(gVar2, androidx.compose.ui.semantics.d.b)) {
                                                                    LayoutNode layoutNode4 = layoutNode3;
                                                                    i12 = i36;
                                                                    layoutNode2 = layoutNode4;
                                                                    int i39 = i33;
                                                                    i13 = length;
                                                                    i14 = i39;
                                                                    num5 = num8;
                                                                    i17 = i31;
                                                                    cnq0Var3 = cnq0Var7;
                                                                    i18 = i34;
                                                                    i15 = i38;
                                                                    i16 = i30;
                                                                    arrayList3 = arrayList4;
                                                                    i19 = i26;
                                                                    hz40Var2 = hz40Var3;
                                                                    cnq0Var4 = cnq0Var5;
                                                                    Integer num10 = num9;
                                                                    i20 = i35;
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i30), 2048, num10, null, 8, null);
                                                                    num6 = num10;
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num5, null, 8, null);
                                                                } else {
                                                                    LayoutNode layoutNode5 = layoutNode3;
                                                                    i12 = i36;
                                                                    layoutNode2 = layoutNode5;
                                                                    int i40 = i33;
                                                                    i13 = length;
                                                                    i14 = i40;
                                                                    i16 = i30;
                                                                    num5 = num8;
                                                                    i17 = i31;
                                                                    cnq0Var3 = cnq0Var7;
                                                                    i18 = i34;
                                                                    i15 = i38;
                                                                    arrayList3 = arrayList4;
                                                                    i19 = i26;
                                                                    num6 = num9;
                                                                    hz40Var2 = hz40Var3;
                                                                    cnq0Var4 = cnq0Var5;
                                                                    i20 = i35;
                                                                    if (jl40.l(gVar2, androidx.compose.ui.semantics.d.K)) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, 8192, null, 8, null);
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num5, null, 8, null);
                                                                    } else if (jl40.l(gVar2, androidx.compose.ui.semantics.d.M)) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, Integer.valueOf(HProv.ALG_TYPE_SECURECHANNEL), null, 8, null);
                                                                    } else if (jl40.l(gVar2, androidx.compose.ui.semantics.d.c)) {
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num6, null, 8, null);
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num5, null, 8, null);
                                                                    } else {
                                                                        androidx.compose.ui.semantics.g gVar4 = androidx.compose.ui.semantics.d.J;
                                                                        if (jl40.l(gVar2, gVar4)) {
                                                                            awk0 awk0Var = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.z);
                                                                            if (awk0Var == null || awk0Var.a != 4) {
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num6, null, 8, null);
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num5, null, 8, null);
                                                                            } else if (jl40.l(androidx.compose.ui.semantics.b.a(cnq0Var3, gVar4), Boolean.TRUE)) {
                                                                                AccessibilityEvent createEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 4);
                                                                                androidx.compose.ui.semantics.c cVar2 = new androidx.compose.ui.semantics.c(cVar.a, true, layoutNode2, cnq0Var3);
                                                                                List list = (List) androidx.compose.ui.semantics.b.a(cVar2.k(), androidx.compose.ui.semantics.d.a);
                                                                                String a = list != null ? rty.a(62, null, ",", list) : null;
                                                                                List list2 = (List) androidx.compose.ui.semantics.b.a(cVar2.k(), androidx.compose.ui.semantics.d.C);
                                                                                String a2 = list2 != null ? rty.a(62, null, ",", list2) : null;
                                                                                if (a != null) {
                                                                                    createEvent.setContentDescription(a);
                                                                                }
                                                                                if (a2 != null) {
                                                                                    createEvent.getText().add(a2);
                                                                                }
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(createEvent);
                                                                            } else {
                                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, num5, null, 8, null);
                                                                            }
                                                                        } else if (jl40.l(gVar2, androidx.compose.ui.semantics.d.a)) {
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, 4, (List) obj2);
                                                                        } else if (!jl40.l(gVar2, androidx.compose.ui.semantics.d.G)) {
                                                                            androidx.compose.ui.semantics.g gVar5 = androidx.compose.ui.semantics.d.H;
                                                                            if (jl40.l(gVar2, gVar5)) {
                                                                                kk2 textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(cnq0Var3);
                                                                                if (textForTextField == null || (str = textForTextField.b) == null) {
                                                                                    str = "";
                                                                                }
                                                                                long j5 = ((asy0) cnq0Var3.d(gVar5)).a;
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Integer.valueOf(str.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str, ParcelSafeTextLength)));
                                                                                androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(i14);
                                                                            } else {
                                                                                if (jl40.l(gVar2, gVar3) || jl40.l(gVar2, androidx.compose.ui.semantics.d.w)) {
                                                                                    androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode2);
                                                                                    bip0 c = m9b1.c(i16, androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
                                                                                    c.a((bhp0) androidx.compose.ui.semantics.b.a(cnq0Var3, gVar3));
                                                                                    c.b((bhp0) androidx.compose.ui.semantics.b.a(cnq0Var3, androidx.compose.ui.semantics.d.w));
                                                                                    androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(c);
                                                                                } else if (jl40.l(gVar2, androidx.compose.ui.semantics.d.l)) {
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), 8));
                                                                                    }
                                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i14), 2048, num5, null, 8, null);
                                                                                } else {
                                                                                    androidx.compose.ui.semantics.g gVar6 = androidx.compose.ui.semantics.a.x;
                                                                                    if (jl40.l(gVar2, gVar6)) {
                                                                                        List list3 = (List) cnq0Var3.d(gVar6);
                                                                                        List list4 = (List) androidx.compose.ui.semantics.b.a(cnq0Var4, gVar6);
                                                                                        if (list4 != null) {
                                                                                            iz40 a3 = dmm0.a();
                                                                                            int size = list3.size();
                                                                                            for (int i41 = 0; i41 < size; i41++) {
                                                                                                a3.a(((nif) list3.get(i41)).b());
                                                                                            }
                                                                                            iz40 a4 = dmm0.a();
                                                                                            int size2 = list4.size();
                                                                                            for (int i42 = 0; i42 < size2; i42++) {
                                                                                                a4.a(((nif) list4.get(i42)).b());
                                                                                            }
                                                                                            z5 = !a3.equals(a4);
                                                                                        } else {
                                                                                            z4 = true;
                                                                                            if (list3.isEmpty()) {
                                                                                                z5 = z2;
                                                                                            }
                                                                                            z5 = z4;
                                                                                        }
                                                                                        z2 = z5;
                                                                                    } else {
                                                                                        z4 = true;
                                                                                        if (obj2 instanceof ag) {
                                                                                            ag agVar = (ag) obj2;
                                                                                            Object a5 = androidx.compose.ui.semantics.b.a(cnq0Var4, gVar2);
                                                                                            if (agVar != a5) {
                                                                                                if (a5 instanceof ag) {
                                                                                                    ag agVar2 = (ag) a5;
                                                                                                    if (jl40.l(agVar.b(), agVar2.b())) {
                                                                                                        if (agVar.a() == null) {
                                                                                                        }
                                                                                                        if (agVar.a() != null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z5 = false;
                                                                                            z2 = z5;
                                                                                        }
                                                                                        z5 = z4;
                                                                                        z2 = z5;
                                                                                    }
                                                                                }
                                                                                j4 >>= 8;
                                                                                int i43 = i12 + 1;
                                                                                Integer num11 = num5;
                                                                                i32 = 8;
                                                                                hz40Var5 = hz40Var2;
                                                                                i26 = i19;
                                                                                cnq0Var7 = cnq0Var3;
                                                                                num8 = num11;
                                                                                int i44 = i13;
                                                                                i33 = i14;
                                                                                length = i44;
                                                                                i30 = i16;
                                                                                cnq0Var5 = cnq0Var4;
                                                                                layoutNode3 = layoutNode2;
                                                                                arrayList4 = arrayList3;
                                                                                i35 = i20;
                                                                                num9 = num6;
                                                                                i31 = i17;
                                                                                i34 = i18;
                                                                                i36 = i43;
                                                                                length2 = i15;
                                                                            }
                                                                        } else if (hz40Var2.b(androidx.compose.ui.semantics.a.k)) {
                                                                            kk2 textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(cnq0Var4);
                                                                            if (textForTextField2 == null) {
                                                                                textForTextField2 = "";
                                                                            }
                                                                            CharSequence textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(cnq0Var3);
                                                                            if (textForTextField3 == null) {
                                                                                textForTextField3 = "";
                                                                            }
                                                                            CharSequence trimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(textForTextField3, ParcelSafeTextLength);
                                                                            int length3 = textForTextField2.length();
                                                                            int length4 = textForTextField3.length();
                                                                            int i45 = length3 > length4 ? length4 : length3;
                                                                            int i46 = 0;
                                                                            while (true) {
                                                                                i21 = length3;
                                                                                if (i46 >= i45) {
                                                                                    i22 = length4;
                                                                                    break;
                                                                                }
                                                                                i22 = length4;
                                                                                if (textForTextField2.charAt(i46) != textForTextField3.charAt(i46)) {
                                                                                    break;
                                                                                }
                                                                                i46++;
                                                                                length3 = i21;
                                                                                length4 = i22;
                                                                            }
                                                                            int i47 = 0;
                                                                            while (true) {
                                                                                if (i47 >= i45 - i46) {
                                                                                    i23 = i47;
                                                                                    break;
                                                                                }
                                                                                i23 = i47;
                                                                                if (textForTextField2.charAt((i21 - 1) - i47) != textForTextField3.charAt((i22 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i47 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i48 = (i21 - i23) - i46;
                                                                            int i49 = (i22 - i23) - i46;
                                                                            androidx.compose.ui.semantics.g gVar7 = androidx.compose.ui.semantics.d.L;
                                                                            boolean b = hz40Var4.b(gVar7);
                                                                            boolean b2 = hz40Var2.b(gVar7);
                                                                            boolean b3 = hz40Var4.b(androidx.compose.ui.semantics.d.G);
                                                                            boolean z7 = b3 && !b && b2;
                                                                            boolean z8 = b3 && b && !b2;
                                                                            if (z7 || z8) {
                                                                                z6 = z8;
                                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), num5, num5, Integer.valueOf(i22), trimToSize);
                                                                            } else {
                                                                                z6 = z8;
                                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 16);
                                                                                createTextSelectionChangedEvent.setFromIndex(i46);
                                                                                createTextSelectionChangedEvent.setRemovedCount(i48);
                                                                                createTextSelectionChangedEvent.setAddedCount(i49);
                                                                                createTextSelectionChangedEvent.setBeforeText(textForTextField2);
                                                                                createTextSelectionChangedEvent.getText().add(trimToSize);
                                                                            }
                                                                            createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                            if (z7 || z6) {
                                                                                long j6 = ((asy0) cnq0Var3.d(androidx.compose.ui.semantics.d.H)).a;
                                                                                createTextSelectionChangedEvent.setFromIndex((int) (j6 >> 32));
                                                                                createTextSelectionChangedEvent.setToIndex((int) (j6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                            }
                                                                        } else {
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i16), 2048, Integer.valueOf(i6), null, 8, null);
                                                                        }
                                                                    }
                                                                }
                                                                j4 >>= 8;
                                                                int i432 = i12 + 1;
                                                                Integer num112 = num5;
                                                                i32 = 8;
                                                                hz40Var5 = hz40Var2;
                                                                i26 = i19;
                                                                cnq0Var7 = cnq0Var3;
                                                                num8 = num112;
                                                                int i442 = i13;
                                                                i33 = i14;
                                                                length = i442;
                                                                i30 = i16;
                                                                cnq0Var5 = cnq0Var4;
                                                                layoutNode3 = layoutNode2;
                                                                arrayList4 = arrayList3;
                                                                i35 = i20;
                                                                num9 = num6;
                                                                i31 = i17;
                                                                i34 = i18;
                                                                i36 = i432;
                                                                length2 = i15;
                                                            } else {
                                                                String str2 = (String) obj2;
                                                                boolean b4 = hz40Var4.b(gVar);
                                                                int i50 = i32;
                                                                if (b4) {
                                                                    androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i30, i50, str2);
                                                                }
                                                            }
                                                        }
                                                        LayoutNode layoutNode6 = layoutNode3;
                                                        i12 = i36;
                                                        layoutNode2 = layoutNode6;
                                                        int i51 = i33;
                                                        i13 = length;
                                                        i14 = i51;
                                                        i16 = i30;
                                                        num5 = num8;
                                                        i17 = i31;
                                                        cnq0Var3 = cnq0Var7;
                                                        i18 = i34;
                                                        i15 = i38;
                                                        arrayList3 = arrayList4;
                                                        i19 = i26;
                                                        num6 = num9;
                                                        hz40Var2 = hz40Var3;
                                                    }
                                                }
                                                registerScrollingId = androidComposeViewAccessibilityDelegateCompat.registerScrollingId(i30, arrayList4);
                                                if (!registerScrollingId) {
                                                }
                                                gVar = androidx.compose.ui.semantics.d.d;
                                                if (jl40.l(gVar2, gVar)) {
                                                }
                                            } else {
                                                LayoutNode layoutNode7 = layoutNode3;
                                                i12 = i36;
                                                layoutNode2 = layoutNode7;
                                                int i52 = i33;
                                                i13 = length;
                                                i14 = i52;
                                                i15 = length2;
                                                i16 = i30;
                                                num5 = num8;
                                                i17 = i31;
                                                cnq0Var3 = cnq0Var7;
                                                i18 = i34;
                                                arrayList3 = arrayList4;
                                                i19 = i26;
                                                num6 = num9;
                                                hz40Var2 = hz40Var5;
                                            }
                                            cnq0Var4 = cnq0Var5;
                                            i20 = i35;
                                            j4 >>= 8;
                                            int i4322 = i12 + 1;
                                            Integer num1122 = num5;
                                            i32 = 8;
                                            hz40Var5 = hz40Var2;
                                            i26 = i19;
                                            cnq0Var7 = cnq0Var3;
                                            num8 = num1122;
                                            int i4422 = i13;
                                            i33 = i14;
                                            length = i4422;
                                            i30 = i16;
                                            cnq0Var5 = cnq0Var4;
                                            layoutNode3 = layoutNode2;
                                            arrayList4 = arrayList3;
                                            i35 = i20;
                                            num9 = num6;
                                            i31 = i17;
                                            i34 = i18;
                                            i36 = i4322;
                                            length2 = i15;
                                        }
                                        int i53 = i26;
                                        hz40Var = hz40Var5;
                                        int i54 = i32;
                                        num4 = num8;
                                        cnq0Var2 = cnq0Var7;
                                        i8 = i53;
                                        int i55 = i33;
                                        i7 = length;
                                        i10 = i55;
                                        int i56 = length2;
                                        i9 = i30;
                                        i5 = i31;
                                        layoutNode = layoutNode3;
                                        i11 = i34;
                                        z = true;
                                        arrayList2 = arrayList4;
                                        num3 = num9;
                                        cnq0Var = cnq0Var5;
                                        if (i35 != i54) {
                                            break;
                                        } else {
                                            length2 = i56;
                                        }
                                    } else {
                                        int i57 = i33;
                                        i7 = length;
                                        i10 = i57;
                                        i9 = i30;
                                        num4 = num8;
                                        i5 = i31;
                                        layoutNode = layoutNode3;
                                        cnq0Var2 = cnq0Var7;
                                        i11 = i34;
                                        z = true;
                                        arrayList2 = arrayList4;
                                        i8 = i26;
                                        num3 = num9;
                                        hz40Var = hz40Var5;
                                        cnq0Var = cnq0Var5;
                                    }
                                    int i58 = i11;
                                    if (i58 == length2) {
                                        break;
                                    }
                                    int i59 = i7;
                                    i33 = i10;
                                    length = i59;
                                    cnq0Var5 = cnq0Var;
                                    layoutNode3 = layoutNode;
                                    hz40Var5 = hz40Var;
                                    arrayList4 = arrayList2;
                                    i26 = i8;
                                    num9 = num3;
                                    iArr3 = iArr2;
                                    jArr3 = jArr2;
                                    i31 = i5;
                                    i34 = i58 + 1;
                                    i30 = i9;
                                    cnq0Var7 = cnq0Var2;
                                    num8 = num4;
                                    i32 = 8;
                                }
                            } else {
                                i9 = i30;
                                num3 = num7;
                                iArr2 = iArr3;
                                jArr2 = jArr3;
                                i7 = length;
                                num4 = num8;
                                i8 = i26;
                                i5 = i31;
                                z = true;
                                arrayList2 = arrayList4;
                                cnq0Var = cnq0Var5;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = cnq0Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    if (!cVar.k().a.b((androidx.compose.ui.semantics.g) ((Map.Entry) it.next()).getKey())) {
                                        z3 = z;
                                        break;
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i9), 2048, num4, null, 8, null);
                            }
                        }
                        i27 = 8;
                    } else {
                        i4 = i29;
                        num3 = num7;
                        i5 = i28;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i6 = i24;
                        i7 = length;
                        num4 = num8;
                        i8 = i26;
                    }
                    j2 >>= i27;
                    i29 = i4 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    x5wVar = newSemanticsNodes;
                    i24 = i6;
                    arrayList4 = arrayList2;
                    num8 = num4;
                    length = i7;
                    i26 = i8;
                    num7 = num3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i28 = i5;
                }
                num = num7;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i24;
                int i60 = length;
                num2 = num8;
                int i61 = i26;
                if (i28 != i27) {
                    return;
                }
                i2 = i60;
                i3 = i61;
            } else {
                num = num7;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i24;
                num2 = num8;
                i2 = length;
                i3 = i26;
            }
            if (i3 == i2) {
                return;
            }
            i26 = i3 + 1;
            androidComposeViewAccessibilityDelegateCompat = this;
            x5wVar = newSemanticsNodes;
            length = i2;
            i24 = i;
            arrayList4 = arrayList;
            num8 = num2;
            num7 = num;
            iArr3 = iArr;
            jArr3 = jArr;
            i25 = 0;
        }
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, xx40 subtreeChangedSemanticsNodesIds) {
        cnq0 u;
        LayoutNode m;
        if (layoutNode.F() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.a0.e(8)) {
                layoutNode = dai0.m(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.w);
            }
            if (layoutNode == null || (u = layoutNode.u()) == null) {
                return;
            }
            if (!u.c && (m = dai0.m(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.w)) != null) {
                layoutNode = m;
            }
            int i = layoutNode.b;
            if (subtreeChangedSemanticsNodesIds.a(i)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i), 2048, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.F() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i = layoutNode.b;
            bhp0 bhp0Var = (bhp0) this.pendingHorizontalScrollEvents.b(i);
            bhp0 bhp0Var2 = (bhp0) this.pendingVerticalScrollEvents.b(i);
            if (bhp0Var == null && bhp0Var2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(i, 4096);
            if (bhp0Var != null) {
                createEvent.setScrollX((int) ((Number) bhp0Var.b().invoke()).floatValue());
                createEvent.setMaxScrollX((int) ((Number) bhp0Var.a().invoke()).floatValue());
            }
            if (bhp0Var2 != null) {
                createEvent.setScrollY((int) ((Number) bhp0Var2.b().invoke()).floatValue());
                createEvent.setMaxScrollY((int) ((Number) bhp0Var2.a().invoke()).floatValue());
            }
            sendEvent(createEvent);
        }
    }

    private final boolean setAccessibilitySelection(androidx.compose.ui.semantics.c node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        cnq0 cnq0Var = node.d;
        int i = node.f;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.a.j;
        if (cnq0Var.a.b(gVar) && dai0.a(node)) {
            zls zlsVar = (zls) ((ag) node.d.d(gVar)).a();
            if (zlsVar != null) {
                return ((Boolean) zlsVar.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
        } else if ((start != end || end != this.accessibilityCursorPosition) && (iterableTextForAccessibility = getIterableTextForAccessibility(node)) != null) {
            if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
                start = -1;
            }
            this.accessibilityCursorPosition = start;
            boolean z = iterableTextForAccessibility.length() > 0;
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
            sendPendingTextTraversedAtGranularityEvent(i);
            return true;
        }
        return false;
    }

    private final void setContentInvalid(androidx.compose.ui.semantics.c node, wh info) {
        cnq0 cnq0Var = node.d;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.M;
        if (cnq0Var.a.b(gVar)) {
            info.a.setContentInvalid(true);
            info.a.setError((CharSequence) androidx.compose.ui.semantics.b.a(node.d, gVar));
        }
    }

    private final void setInvisibleIfEmptyBounds(wh whVar, androidx.compose.ui.semantics.c cVar) {
        if (cVar.n().g()) {
            whVar.G(false);
        }
    }

    private final void setText(androidx.compose.ui.semantics.c node, wh info) {
        kk2 t = dai0.t(node);
        info.E(t != null ? toSpannableString(t) : null);
    }

    private final Rect toAndroidRect(zii0 zii0Var, float f, float f2) {
        return new Rect((int) (zii0Var.a + f), (int) (zii0Var.b + f2), (int) (zii0Var.c + f), (int) (zii0Var.d + f2));
    }

    public static /* synthetic */ Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, zii0 zii0Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(zii0Var, f, f2);
    }

    private final Rect toBoundsInScreen(float left, float top, float right, float bottom) {
        long mo65localToScreenMKHz9U = this.view.mo65localToScreenMKHz9U((Float.floatToRawIntBits(top) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(left) << 32));
        long mo65localToScreenMKHz9U2 = this.view.mo65localToScreenMKHz9U((Float.floatToRawIntBits(bottom) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(right) << 32));
        int i = (int) (mo65localToScreenMKHz9U >> 32);
        int i2 = (int) (mo65localToScreenMKHz9U2 >> 32);
        int floor = (int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)));
        float intBitsToFloat = Float.intBitsToFloat((int) (mo65localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i3 = (int) (mo65localToScreenMKHz9U2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return new Rect(floor, (int) Math.floor(Math.min(intBitsToFloat, Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(r9), Float.intBitsToFloat(i3))));
    }

    private final zii0 toBoundsRelativeToNodeBounds(Rect rect, Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new zii0(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final float[] toCornerArray(ix80 ix80Var) {
        if (!(ix80Var instanceof hx80)) {
            return null;
        }
        hx80 hx80Var = (hx80) ix80Var;
        return new float[]{Float.intBitsToFloat((int) (hx80Var.b().f() >> 32)), Float.intBitsToFloat((int) (hx80Var.b().f() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (hx80Var.b().g() >> 32)), Float.intBitsToFloat((int) (hx80Var.b().g() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (hx80Var.b().b() >> 32)), Float.intBitsToFloat((int) (hx80Var.b().b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (hx80Var.b().a() >> 32)), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & hx80Var.b().a()))};
    }

    private final Region toRegion(ix80 ix80Var, float f, float f2) {
        if (ix80Var instanceof fx80) {
            fx80 fx80Var = (fx80) ix80Var;
            Region region = new Region(toAndroidRect$default(this, fx80Var.a().i(f, f2), 0.0f, 0.0f, 3, null));
            Region region2 = new Region();
            rq90 b = fx80Var.b();
            if (b instanceof jb2) {
                Path k = ((jb2) b).k();
                k.offset(f, f2);
                region2.setPath(k, region);
                return region2;
            }
            w511.x("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    private final RectF toScreenCoords(androidx.compose.ui.semantics.c textNode, zii0 bounds) {
        if (textNode != null) {
            zii0 j = bounds.j(textNode.m());
            zii0 g = textNode.g();
            zii0 f = j.h(g) ? j.f(g) : null;
            if (f != null) {
                AndroidComposeView androidComposeView = this.view;
                float f2 = f.a;
                long mo65localToScreenMKHz9U = androidComposeView.mo65localToScreenMKHz9U((Float.floatToRawIntBits(f.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32));
                AndroidComposeView androidComposeView2 = this.view;
                float f3 = f.c;
                long mo65localToScreenMKHz9U2 = androidComposeView2.mo65localToScreenMKHz9U((Float.floatToRawIntBits(f.d) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f3) << 32));
                int i = (int) (mo65localToScreenMKHz9U >> 32);
                int i2 = (int) (mo65localToScreenMKHz9U2 >> 32);
                float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                int i3 = (int) (mo65localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat = Float.intBitsToFloat(i3);
                int i4 = (int) (mo65localToScreenMKHz9U2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                return new RectF(min, Math.min(intBitsToFloat, Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
            }
        }
        return null;
    }

    private final SpannableString toSpannableString(kk2 kk2Var) {
        return (SpannableString) trimToSize(androidx.compose.ui.text.platform.a.a(kk2Var, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    private final boolean traverseAtGranularity(androidx.compose.ui.semantics.c node, int granularity, boolean forward, boolean extendSelection) {
        eh iteratorForGranularity;
        int i;
        int i2;
        int i3 = node.f;
        Integer num = this.previousTraversedNode;
        if (num == null || i3 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.f);
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        boolean z = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0 && (iteratorForGranularity = getIteratorForGranularity(node, granularity)) != null) {
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
            }
            int[] a = forward ? iteratorForGranularity.a(accessibilitySelectionEnd) : iteratorForGranularity.b(accessibilitySelectionEnd);
            if (a != null) {
                int i4 = a[0];
                z = true;
                int i5 = a[1];
                if (extendSelection && isAccessibilitySelectionExtendable(node)) {
                    i = getAccessibilitySelectionStart(node);
                    if (i == -1) {
                        i = forward ? i4 : i5;
                    }
                    i2 = forward ? i5 : i4;
                } else {
                    i = forward ? i5 : i4;
                    i2 = i;
                }
                this.pendingTextTraversedEvent = new m82(node, forward ? 256 : 512, granularity, i4, i5, SystemClock.uptimeMillis());
                setAccessibilitySelection(node, i, i2, true);
            }
        }
        return z;
    }

    private final <T extends CharSequence> T trimToSize(T text, int size) {
        if (size <= 0) {
            ny61.g("size should be greater than 0");
            return null;
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        return (T) text.subSequence(0, size);
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, 256, null, null, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0153, code lost:
    
        if (((((~r13) << 6) & r13) & r16) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0155, code lost:
    
        r27 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        long j5;
        int i;
        int i2;
        long j6;
        char c2;
        xx40 xx40Var = new xx40((Object) null);
        xx40 xx40Var2 = this.paneDisplayed;
        int[] iArr = xx40Var2.b;
        long[] jArr3 = xx40Var2.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j9 = jArr3[i4];
                j2 = 128;
                if ((((~j9) << c3) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j9 & j7) < 128) {
                            j6 = j7;
                            int i7 = iArr[(i4 << 3) + i6];
                            jnq0 jnq0Var = (jnq0) getCurrentSemanticsNodes().b(i7);
                            androidx.compose.ui.semantics.c cVar = jnq0Var != null ? jnq0Var.a : null;
                            if (cVar != null) {
                                c2 = c3;
                                if (cVar.d.a.b(androidx.compose.ui.semantics.d.d)) {
                                }
                            } else {
                                c2 = c3;
                            }
                            xx40Var.a(i7);
                            inq0 inq0Var = (inq0) this.previousSemanticsNodes.b(i7);
                            sendPaneChangeEvents(i7, 32, inq0Var != null ? (String) androidx.compose.ui.semantics.b.a(inq0Var.a, androidx.compose.ui.semantics.d.d) : null);
                        } else {
                            j6 = j7;
                            c2 = c3;
                        }
                        j9 >>= 8;
                        i6++;
                        c3 = c2;
                        j7 = j6;
                    }
                    j = j7;
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    j = j7;
                    c = c3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                c3 = c;
                j7 = j;
            }
        } else {
            j = 255;
            c = 7;
            j2 = 128;
        }
        xx40 xx40Var3 = this.paneDisplayed;
        int i8 = xx40Var3.d;
        int[] iArr2 = xx40Var.b;
        long[] jArr4 = xx40Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j10 = jArr4[i9];
                if ((((~j10) << c) & j10 & j8) != j8) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j10 & j) < j2) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            j5 = j8;
                            int i14 = i13 & HProv.PP_VERSION_TIMESTAMP;
                            int i15 = xx40Var3.c;
                            int i16 = (i13 >>> 7) & i15;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = xx40Var3.a;
                                int i18 = i16 >> 3;
                                i = i3;
                                int i19 = (i16 & 7) << 3;
                                long j11 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                j4 = j10;
                                long j12 = (i14 * 72340172838076673L) ^ j11;
                                long j13 = (j12 - 72340172838076673L) & (~j12) & j5;
                                while (true) {
                                    if (j13 == 0) {
                                        break;
                                    }
                                    i2 = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                                    jArr2 = jArr4;
                                    if (xx40Var3.b[i2] == i12) {
                                        break;
                                    }
                                    j13 &= j13 - 1;
                                    jArr4 = jArr2;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i15;
                                j10 = j4;
                                i3 = i;
                                jArr4 = jArr2;
                            }
                            int i20 = i2;
                            if (i20 >= 0) {
                                xx40Var3.h(i20);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j10;
                            j5 = j8;
                            i = i3;
                        }
                        j10 = j4 >> i;
                        i11++;
                        j8 = j5;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    j3 = j8;
                    if (i10 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    j3 = j8;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                j8 = j3;
                jArr4 = jArr;
                i3 = 8;
            }
        } else {
            j3 = -9187201950435737472L;
        }
        this.previousSemanticsNodes.c();
        x5w currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.b;
        Object[] objArr = currentSemanticsNodes.c;
        long[] jArr6 = currentSemanticsNodes.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j14 = jArr6[i21];
                if ((((~j14) << c) & j14 & j3) != j3) {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j14 & j) < j2) {
                            int i24 = (i21 << 3) + i23;
                            int i25 = iArr3[i24];
                            androidx.compose.ui.semantics.c cVar2 = ((jnq0) objArr[i24]).a;
                            cnq0 cnq0Var = cVar2.d;
                            androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.d;
                            if (cnq0Var.a.b(gVar) && this.paneDisplayed.a(i25)) {
                                sendPaneChangeEvents(i25, 16, (String) cVar2.d.d(gVar));
                            }
                            this.previousSemanticsNodes.i(i25, new inq0(cVar2, getCurrentSemanticsNodes()));
                        }
                        j14 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length3) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.previousSemanticsRoot = new inq0(this.view.getSemanticsOwner().a(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:14:0x0057, B:20:0x0067, B:22:0x006f, B:24:0x0078, B:26:0x007f, B:28:0x0090, B:31:0x009d, B:32:0x00a4, B:40:0x0045, B:42:0x004c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bf -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(Continuation<? super zy11> continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        xx40 xx40Var;
        jq6 it;
        xx40 xx40Var2;
        Object a;
        try {
            if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                int i2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        xx40Var = new xx40((Object) null);
                        it = this.boundsUpdateChannel.iterator();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = xx40Var;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        a = it.a(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (a != coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        it = (jq6) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        xx40Var2 = (xx40) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (jq6) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        xx40Var2 = (xx40) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        kotlin.b.b(obj);
                        xx40Var = xx40Var2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = xx40Var;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        a = it.a(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (a != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        xx40Var2 = xx40Var;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            this.subtreeChangedLayoutNodes.clear();
                            return zy11.a;
                        }
                        it.b();
                        if (isEnabled$ui()) {
                            int i3 = this.subtreeChangedLayoutNodes.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                LayoutNode layoutNode = (LayoutNode) this.subtreeChangedLayoutNodes.b[i4];
                                sendSubtreeChangeAccessibilityEvents(layoutNode, xx40Var2);
                                sendTypeViewScrolledAccessibilityEvent(layoutNode);
                            }
                            xx40Var2.b();
                            Handler handler = getHandler();
                            if (!this.checkingForSemanticsChanges && handler != null) {
                                this.checkingForSemanticsChanges = true;
                                handler.post(this.semanticsChangeChecker);
                            }
                        }
                        this.subtreeChangedLayoutNodes.clear();
                        this.pendingHorizontalScrollEvents.c();
                        this.pendingVerticalScrollEvents.c();
                        long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = xx40Var2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.subtreeChangedLayoutNodes.clear();
            throw th;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m77canScroll0AR0LA0$ui(boolean vertical, int direction, long position) {
        if (jl40.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m74canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui = hitTestSemanticsAt$ui(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(hitTestSemanticsAt$ui);
            if (hitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getHoveredVirtualViewId$ui, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    /* renamed from: getIdToAfterMap$ui, reason: from getter */
    public final ux40 getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* renamed from: getIdToBeforeMap$ui, reason: from getter */
    public final ux40 getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* renamed from: getOnSendAccessibilityEvent$ui, reason: from getter */
    public final tls getOnSendAccessibilityEvent() {
        return this.onSendAccessibilityEvent;
    }

    /* renamed from: getRequestFromAccessibilityToolForTesting$ui, reason: from getter */
    public final Boolean getRequestFromAccessibilityToolForTesting() {
        return this.requestFromAccessibilityToolForTesting;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui(float x, float y) {
        this.view.measureAndLayout(true);
        cnu cnuVar = new cnu();
        LayoutNode root = this.view.getRoot();
        long floatToRawIntBits = (Float.floatToRawIntBits(y) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(x) << 32);
        z0y z0yVar = LayoutNode.m0;
        t300 t300Var = root.a0;
        androidx.compose.ui.node.s sVar = (androidx.compose.ui.node.s) t300Var.e;
        tls tlsVar = androidx.compose.ui.node.s.j0;
        ((androidx.compose.ui.node.s) t300Var.e).g1(androidx.compose.ui.node.s.p0, sVar.Y0(floatToRawIntBits), cnuVar, 1, true);
        for (int f = scc.f(cnuVar); -1 < f; f--) {
            LayoutNode P = qje.P((e530) cnuVar.a.b(f));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(P) != null) {
                return Integer.MIN_VALUE;
            }
            if (P.a0.e(8)) {
                int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(P.b);
                androidx.compose.ui.semantics.c a = q5z.a(P, false);
                if (cvw.Q(a) && !g9b1.b(a)) {
                    return semanticsNodeIdToAccessibilityVirtualNodeId;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        resetEnabledAccessibilityServiceList();
    }

    public final void onLayoutChange$ui(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean enabled) {
        resetEnabledAccessibilityServiceList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        getHandler().removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui(ux40 ux40Var) {
        this.idToAfterMap = ux40Var;
    }

    public final void setIdToBeforeMap$ui(ux40 ux40Var) {
        this.idToBeforeMap = ux40Var;
    }

    public final void setOnSendAccessibilityEvent$ui(tls tlsVar) {
        this.onSendAccessibilityEvent = tlsVar;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    private final Rect toAndroidRect(ix80 ix80Var, float f, float f2) {
        if ((ix80Var instanceof gx80) || (ix80Var instanceof hx80)) {
            return toAndroidRect(ix80Var.a(), f, f2);
        }
        return null;
    }
}
