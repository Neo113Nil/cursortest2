package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.w;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.bb1;
import defpackage.bms;
import defpackage.bx60;
import defpackage.c530;
import defpackage.c82;
import defpackage.ed2;
import defpackage.eja1;
import defpackage.f530;
import defpackage.f851;
import defpackage.fd2;
import defpackage.fia1;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gwk0;
import defpackage.hz40;
import defpackage.i28;
import defpackage.ixv;
import defpackage.j2m0;
import defpackage.jxi;
import defpackage.k751;
import defpackage.m390;
import defpackage.m3t0;
import defpackage.ma91;
import defpackage.n390;
import defpackage.n3t0;
import defpackage.n751;
import defpackage.ohh0;
import defpackage.pey;
import defpackage.q651;
import defpackage.qam;
import defpackage.qgd;
import defpackage.qy40;
import defpackage.rzx;
import defpackage.s72;
import defpackage.s8o;
import defpackage.sls;
import defpackage.t72;
import defpackage.tje;
import defpackage.tls;
import defpackage.ttd;
import defpackage.u1w;
import defpackage.uh6;
import defpackage.un50;
import defpackage.vn50;
import defpackage.vng;
import defpackage.wwg;
import defpackage.wz40;
import defpackage.y6i0;
import defpackage.zrb1;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u0000 à\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002á\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001a¢\u0006\u0004\bC\u0010\u001cJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020$H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJG\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\u0006\u0010[\u001a\u000204H\u0016¢\u0006\u0004\b\\\u0010]J?\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010^J7\u0010a\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\n2\u0006\u0010[\u001a\u0002042\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020$H\u0016¢\u0006\u0004\bj\u0010LJ\u001f\u0010n\u001a\u00020l2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010s\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020w2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJE\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010{2\u0006\u0010|\u001a\u00028\u00002$\u0010~\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000}H\u0082\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001J<\u0010\u0086\u0001\u001a\u00030\u0081\u0001*\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0088\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0089\u0001R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010\u0016R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008c\u0001R?\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00012\r\u0010|\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0094\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R?\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00012\r\u0010|\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u008f\u0001\u001a\u0006\b\u0097\u0001\u0010\u0091\u0001\"\u0006\b\u0098\u0001\u0010\u0093\u0001R?\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00012\r\u0010|\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u008f\u0001\u001a\u0006\b\u009a\u0001\u0010\u0091\u0001\"\u0006\b\u009b\u0001\u0010\u0093\u0001R3\u0010\u009d\u0001\u001a\u00030\u009c\u00012\u0007\u0010|\u001a\u00030\u009c\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R9\u0010¤\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R3\u0010«\u0001\u001a\u00030ª\u00012\u0007\u0010|\u001a\u00030ª\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R9\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030ª\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010¥\u0001\u001a\u0006\b²\u0001\u0010§\u0001\"\u0006\b³\u0001\u0010©\u0001R7\u0010µ\u0001\u001a\u0005\u0018\u00010´\u00012\t\u0010|\u001a\u0005\u0018\u00010´\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R7\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\t\u0010|\u001a\u0005\u0018\u00010»\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u0017\u0010Â\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010Å\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010Ç\u0001R2\u0010Ê\u0001\u001a\u001b\u0012\u0007\u0012\u0005\u0018\u00010È\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u0001j\u0005\u0018\u0001`É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010¥\u0001R\u001e\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010\u008f\u0001R\u001e\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010\u008f\u0001R8\u0010Í\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010¥\u0001\u001a\u0006\bÎ\u0001\u0010§\u0001\"\u0006\bÏ\u0001\u0010©\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010Ã\u0001R\u0019\u0010Ð\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0088\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010\u0088\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u0019\u0010Õ\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u0095\u0001R\u001d\u0010×\u0001\u001a\u00030Ö\u00018\u0006¢\u0006\u0010\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0016\u0010Û\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010LR\u0018\u0010ß\u0001\u001a\u00030Ü\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006â\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lun50;", "Lqgd;", "Ln390;", "Lbx60;", "Landroid/content/Context;", "context", "Lttd;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Lm390;", "owner", "<init>", "(Landroid/content/Context;Lttd;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Lm390;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lzy11;", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "rectangle", "immediate", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Ln751;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "min", CspBioProgressConstants.MAX, "preferred", "obtainMeasureSpec", "(III)I", "insetToLayoutPosition", "(Ln751;)Ln751;", "Lq651;", "bounds", "insetBounds", "(Lq651;)Lq651;", "T", "value", "Lkotlin/Function4;", "block", "insetValue", "(Ljava/lang/Object;Lbms;)Ljava/lang/Object;", "Lu1w;", "left", "top", "right", "bottom", "inset", "(Lu1w;IIII)Lu1w;", CA20Status.STATUS_USER_I, "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroid/view/View;", "getView", "Lm390;", "Lkotlin/Function0;", "update", "Lsls;", "getUpdate", "()Lsls;", "setUpdate", "(Lsls;)V", "hasUpdateBlock", "Z", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Lf530;", "modifier", "Lf530;", "getModifier", "()Lf530;", "setModifier", "(Lf530;)V", "Lkotlin/Function1;", "onModifierChanged", "Ltls;", "getOnModifierChanged$ui", "()Ltls;", "setOnModifierChanged$ui", "(Ltls;)V", "Lfwi;", "density", "Lfwi;", "getDensity", "()Lfwi;", "setDensity", "(Lfwi;)V", "onDensityChanged", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "Lpey;", "lifecycleOwner", "Lpey;", "getLifecycleOwner", "()Lpey;", "setLifecycleOwner", "(Lpey;)V", "Lj2m0;", "savedStateRegistryOwner", "Lj2m0;", "getSavedStateRegistryOwner", "()Lj2m0;", "setSavedStateRegistryOwner", "(Lj2m0;)V", "position", "[I", "Lk6w;", "size", "J", "Ln751;", "Lzii0;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "bringIntoViewRequester", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Lvn50;", "nestedScrollingParentHelper", "Lvn50;", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "isValidOwnerScope", "Landroidx/compose/ui/node/w;", "getSnapshotObserver", "()Landroidx/compose/ui/node/w;", "snapshotObserver", "Companion", "fd2", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements un50, qgd, n390, bx60 {
    public static final int $stable = 8;
    public static final fd2 Companion = new fd2();
    private static final tls OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.w;
    private tls bringIntoViewRequester;
    private final int compositeKeyHash;
    private fwi density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private n751 insets;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private pey lifecycleOwner;
    private final int[] location;
    private f530 modifier;
    private final vn50 nestedScrollingParentHelper;
    private tls onDensityChanged;
    private tls onModifierChanged;
    private tls onRequestDisallowInterceptTouchEvent;
    private final m390 owner;
    private final int[] position;
    private sls release;
    private sls reset;
    private final sls runInvalidate;
    private final sls runUpdate;
    private j2m0 savedStateRegistryOwner;
    private long size;
    private sls update;
    private final View view;

    public AndroidViewHolder(Context context, ttd ttdVar, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, m390 m390Var) {
        super(context);
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = m390Var;
        if (ttdVar != null) {
            hz40 hz40Var = f851.a;
            setTag(ohh0.androidx_compose_ui_view_composition_context, ttdVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        androidx.core.view.b.u(this, new ed2(this));
        ViewCompat$Api21Impl.o(this, this);
        this.update = AndroidViewHolder$update$1.w;
        this.reset = AndroidViewHolder$reset$1.w;
        this.release = AndroidViewHolder$release$1.w;
        c530 c530Var = c530.a;
        this.modifier = c530Var;
        this.density = vng.a();
        this.position = new int[2];
        this.size = 0L;
        this.runUpdate = new sls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                boolean z;
                w snapshotObserver;
                tls tlsVar;
                z = AndroidViewHolder.this.hasUpdateBlock;
                if (z && AndroidViewHolder.this.isAttachedToWindow()) {
                    ViewParent parent = AndroidViewHolder.this.getView().getParent();
                    AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                    if (parent == androidViewHolder) {
                        snapshotObserver = androidViewHolder.getSnapshotObserver();
                        AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                        tlsVar = AndroidViewHolder.OnCommitAffectingUpdate;
                        snapshotObserver.a.c(androidViewHolder2, tlsVar, AndroidViewHolder.this.getUpdate());
                    }
                }
                return zy11.a;
            }
        };
        this.runInvalidate = new sls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                AndroidViewHolder.this.getLayoutNode().A();
                return zy11.a;
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new vn50();
        final LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.H = this;
        final f530 k = eja1.y(bb1.g(androidx.compose.ui.input.pointer.d.a(fnq0.b(androidx.compose.ui.input.nestedscroll.b.a(c530Var, uh6.a, nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.w), this), new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                i28 q = ((qam) obj).N().q();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    m390 m390Var2 = layoutNode2.G;
                    AndroidComposeView androidComposeView = m390Var2 instanceof AndroidComposeView ? (AndroidComposeView) m390Var2 : null;
                    if (androidComposeView != null) {
                        Canvas canvas = t72.a;
                        androidComposeView.drawAndroidView(androidViewHolder2, ((s72) q).a);
                    }
                    androidViewHolder.isDrawing = false;
                }
                return zy11.a;
            }
        }), new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
            
                if (defpackage.k6w.a(r4, r0) == false) goto L10;
             */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                m390 m390Var2;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                long j;
                n751 n751Var;
                int[] iArr4;
                n751 insetToLayoutPosition;
                int[] iArr5;
                long j2;
                uh6.d(AndroidViewHolder.this, layoutNode);
                m390Var2 = AndroidViewHolder.this.owner;
                m390Var2.onInteropViewLayoutChange(AndroidViewHolder.this);
                iArr = AndroidViewHolder.this.position;
                int i2 = iArr[0];
                iArr2 = AndroidViewHolder.this.position;
                int i3 = iArr2[1];
                View view2 = AndroidViewHolder.this.getView();
                iArr3 = AndroidViewHolder.this.position;
                view2.getLocationOnScreen(iArr3);
                j = AndroidViewHolder.this.size;
                AndroidViewHolder.this.size = ((rzx) obj).e();
                n751Var = AndroidViewHolder.this.insets;
                if (n751Var != null) {
                    iArr4 = AndroidViewHolder.this.position;
                    if (i2 == iArr4[0]) {
                        iArr5 = AndroidViewHolder.this.position;
                        if (i3 == iArr5[1]) {
                            j2 = AndroidViewHolder.this.size;
                        }
                    }
                    insetToLayoutPosition = AndroidViewHolder.this.insetToLayoutPosition(n751Var);
                    WindowInsets g = insetToLayoutPosition.g();
                    if (g != null) {
                        AndroidViewHolder.this.getView().dispatchApplyWindowInsets(g);
                    }
                }
                return zy11.a;
            }
        }).k(new c(new AndroidViewHolder$layoutNode$1$coreModifier$4(this)));
        layoutNode.b0(this.modifier.k(k));
        this.onModifierChanged = new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                LayoutNode.this.b0(((f530) obj).k(k));
                return zy11.a;
            }
        };
        layoutNode.X(this.density);
        this.onDensityChanged = new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                LayoutNode.this.X((fwi) obj);
                return zy11.a;
            }
        };
        layoutNode.h0 = new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                m390 m390Var2 = (m390) obj;
                AndroidComposeView androidComposeView = m390Var2 instanceof AndroidComposeView ? (AndroidComposeView) m390Var2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(AndroidViewHolder.this, layoutNode);
                }
                ViewParent parent = AndroidViewHolder.this.getView().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
                return zy11.a;
            }
        };
        layoutNode.i0 = new tls() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                m390 m390Var2 = (m390) obj;
                AndroidComposeView androidComposeView = m390Var2 instanceof AndroidComposeView ? (AndroidComposeView) m390Var2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(AndroidViewHolder.this);
                }
                AndroidViewHolder.this.removeAllViewsInLayout();
                return zy11.a;
            }
        };
        layoutNode.a0(new a(this, layoutNode));
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            ixv.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final u1w inset(u1w u1wVar, int i, int i2, int i3, int i4) {
        int i5 = u1wVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = u1wVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = u1wVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = u1wVar.d - i4;
        return u1w.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q651 insetBounds(q651 bounds) {
        androidx.compose.ui.node.f fVar = (androidx.compose.ui.node.f) this.layoutNode.a0.d;
        if (fVar.d()) {
            long V = wwg.V(fVar.v(0L));
            int i = (int) (V >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (V & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i3 = i2 < 0 ? 0 : i2;
            long e = gwk0.o(fVar).e();
            int i4 = (int) (e >> 32);
            int i5 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            long j = fVar.c;
            long V2 = wwg.V(fVar.v((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            int i6 = i4 - ((int) (V2 >> 32));
            int i7 = i6 < 0 ? 0 : i6;
            int i8 = i5 - ((int) (V2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            int i9 = i8 >= 0 ? i8 : 0;
            if (i != 0 || i3 != 0 || i7 != 0 || i9 != 0) {
                int i10 = i;
                int i11 = i9;
                return new q651(inset(bounds.a, i10, i3, i7, i11), inset(bounds.b, i10, i3, i7, i11));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n751 insetToLayoutPosition(n751 insets) {
        k751 k751Var = insets.a;
        u1w g = k751Var.g(-1);
        u1w u1wVar = u1w.e;
        if (!g.equals(u1wVar) || !k751Var.h(-9).equals(u1wVar) || k751Var.f() != null) {
            androidx.compose.ui.node.f fVar = (androidx.compose.ui.node.f) this.layoutNode.a0.d;
            if (fVar.d()) {
                long V = wwg.V(fVar.v(0L));
                int i = (int) (V >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (V & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (i2 < 0) {
                    i2 = 0;
                }
                long e = gwk0.o(fVar).e();
                int i3 = (int) (e >> 32);
                int i4 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long j = fVar.c;
                long V2 = wwg.V(fVar.v((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                int i5 = i3 - ((int) (V2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & V2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return insets.a.n(i, i2, i5, i7);
                }
            }
        }
        return insets;
    }

    private final <T> T insetValue(T value, bms block) {
        androidx.compose.ui.node.f fVar = (androidx.compose.ui.node.f) this.layoutNode.a0.d;
        if (fVar.d()) {
            long V = wwg.V(fVar.v(0L));
            int i = (int) (V >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (V & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            if (i2 < 0) {
                i2 = 0;
            }
            long e = gwk0.o(fVar).e();
            int i3 = (int) (e >> 32);
            int i4 = (int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            long j = fVar.c;
            long V2 = wwg.V(fVar.v((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            int i5 = i3 - ((int) (V2 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & V2));
            int i7 = i6 >= 0 ? i6 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                return (T) block.invoke(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i7));
            }
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(y6i0.d(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final fwi getDensity() {
        return this.density;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final pey getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final f530 getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    /* renamed from: getOnDensityChanged$ui, reason: from getter */
    public final tls getOnDensityChanged() {
        return this.onDensityChanged;
    }

    /* renamed from: getOnModifierChanged$ui, reason: from getter */
    public final tls getOnModifierChanged() {
        return this.onModifierChanged;
    }

    /* renamed from: getOnRequestDisallowInterceptTouchEvent$ui, reason: from getter */
    public final tls getOnRequestDisallowInterceptTouchEvent() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final sls getRelease() {
        return this.release;
    }

    public final sls getReset() {
        return this.reset;
    }

    public final j2m0 getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final sls getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @jxi
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.A();
        } else {
            this.view.postOnAnimation(new c82(2, this.runInvalidate));
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // defpackage.n390
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        this.insets = new n751(insets);
        return insetToLayoutPosition(insets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // defpackage.qgd
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x000e, B:8:0x0018, B:11:0x0080, B:13:0x0088, B:15:0x0098, B:17:0x008d, B:20:0x0029, B:23:0x0035, B:25:0x004a, B:27:0x0056, B:29:0x0060, B:31:0x0070, B:38:0x007b, B:41:0x009c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        n3t0 n3t0Var = getSnapshotObserver().a;
        synchronized (n3t0Var.g) {
            try {
                wz40 wz40Var = n3t0Var.f;
                int i3 = wz40Var.c;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = wz40Var.a;
                    if (i4 < i3) {
                        m3t0 m3t0Var = (m3t0) objArr[i4];
                        qy40 qy40Var = (qy40) m3t0Var.f.m(this);
                        if (qy40Var != null) {
                            Object[] objArr2 = qy40Var.b;
                            int[] iArr = qy40Var.c;
                            long[] jArr = qy40Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                m3t0Var.c(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (m3t0Var.f.g()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = wz40Var.a;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (m3t0Var.f.g()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        wz40Var.c = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        tje.N(this.dispatcher.c(), null, null, new AndroidViewHolder$onNestedFling$1(consumed, this, ma91.a(velocityX * (-1.0f), velocityY * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        tje.N(this.dispatcher.c(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, ma91.a(velocityX * (-1.0f), velocityY * (-1.0f)), null), 3);
        return false;
    }

    @Override // defpackage.tn50
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            long floatToRawIntBits = (Float.floatToRawIntBits(dx * (-1.0f)) << 32) | (Float.floatToRawIntBits(dy * (-1.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i = type == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.c cVar = nestedScrollDispatcher.a;
            androidx.compose.ui.input.nestedscroll.c F0 = cVar != null ? cVar.F0() : null;
            long mo34onPreScrollOzD1aCk = F0 != null ? F0.mo34onPreScrollOzD1aCk(floatToRawIntBits, i) : 0L;
            consumed[0] = zrb1.d(Float.intBitsToFloat((int) (mo34onPreScrollOzD1aCk >> 32)));
            consumed[1] = zrb1.d(Float.intBitsToFloat((int) (mo34onPreScrollOzD1aCk & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
    }

    @Override // defpackage.un50
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            long floatToRawIntBits = (Float.floatToRawIntBits(dxConsumed * (-1.0f)) << 32) | (Float.floatToRawIntBits(dyConsumed * (-1.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(dxUnconsumed * (-1.0f)) << 32) | (Float.floatToRawIntBits(dyUnconsumed * (-1.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i = type == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.c cVar = nestedScrollDispatcher.a;
            androidx.compose.ui.input.nestedscroll.c F0 = cVar != null ? cVar.F0() : null;
            long mo29onPostScrollDzOQY0M = F0 != null ? F0.mo29onPostScrollDzOQY0M(floatToRawIntBits, floatToRawIntBits2, i) : 0L;
            consumed[0] = zrb1.d(Float.intBitsToFloat((int) (mo29onPostScrollDzOQY0M >> 32)));
            consumed[1] = zrb1.d(Float.intBitsToFloat((int) (mo29onPostScrollDzOQY0M & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
    }

    @Override // defpackage.tn50
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        vn50 vn50Var = this.nestedScrollingParentHelper;
        if (type == 1) {
            vn50Var.b = axes;
        } else {
            vn50Var.a = axes;
        }
    }

    @Override // defpackage.qgd
    public void onRelease() {
        this.release.invoke();
    }

    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // defpackage.tn50
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // defpackage.tn50
    public void onStopNestedScroll(View target, int type) {
        vn50 vn50Var = this.nestedScrollingParentHelper;
        if (type == 1) {
            vn50Var.b = 0;
        } else {
            vn50Var.a = 0;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        tls tlsVar = this.bringIntoViewRequester;
        if (tlsVar == null) {
            return true;
        }
        tlsVar.invoke(rectangle != null ? fia1.g(rectangle) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        tls tlsVar = this.onRequestDisallowInterceptTouchEvent;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(fwi fwiVar) {
        if (fwiVar != this.density) {
            this.density = fwiVar;
            tls tlsVar = this.onDensityChanged;
            if (tlsVar != null) {
                tlsVar.invoke(fwiVar);
            }
        }
    }

    public final void setLifecycleOwner(pey peyVar) {
        if (peyVar != this.lifecycleOwner) {
            this.lifecycleOwner = peyVar;
            vng.E(this, peyVar);
        }
    }

    public final void setModifier(f530 f530Var) {
        if (f530Var != this.modifier) {
            this.modifier = f530Var;
            tls tlsVar = this.onModifierChanged;
            if (tlsVar != null) {
                tlsVar.invoke(f530Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(tls tlsVar) {
        this.onDensityChanged = tlsVar;
    }

    public final void setOnModifierChanged$ui(tls tlsVar) {
        this.onModifierChanged = tlsVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(tls tlsVar) {
        this.onRequestDisallowInterceptTouchEvent = tlsVar;
    }

    public final void setRelease(sls slsVar) {
        this.release = slsVar;
    }

    public final void setReset(sls slsVar) {
        this.reset = slsVar;
    }

    public final void setSavedStateRegistryOwner(j2m0 j2m0Var) {
        if (j2m0Var != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = j2m0Var;
            s8o.R(this, j2m0Var);
        }
    }

    public final void setUpdate(sls slsVar) {
        this.update = slsVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.tn50
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            long floatToRawIntBits = (Float.floatToRawIntBits(dxConsumed * (-1.0f)) << 32) | (Float.floatToRawIntBits(dyConsumed * (-1.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(dxUnconsumed * (-1.0f)) << 32) | (Float.floatToRawIntBits(dyUnconsumed * (-1.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            int i = type == 0 ? 1 : 2;
            androidx.compose.ui.input.nestedscroll.c cVar = nestedScrollDispatcher.a;
            androidx.compose.ui.input.nestedscroll.c F0 = cVar != null ? cVar.F0() : null;
            if (F0 != null) {
                F0.mo29onPostScrollDzOQY0M(floatToRawIntBits, floatToRawIntBits2, i);
            }
        }
    }
}
