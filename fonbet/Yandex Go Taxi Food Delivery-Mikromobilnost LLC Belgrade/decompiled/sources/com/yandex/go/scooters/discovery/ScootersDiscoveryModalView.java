package com.yandex.go.scooters.discovery;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.a3v;
import defpackage.a850;
import defpackage.ah00;
import defpackage.c230;
import defpackage.cma1;
import defpackage.co40;
import defpackage.e230;
import defpackage.ehn0;
import defpackage.fva0;
import defpackage.g8n0;
import defpackage.gh00;
import defpackage.gzr0;
import defpackage.h3y;
import defpackage.iin0;
import defpackage.ip11;
import defpackage.isj;
import defpackage.j5z;
import defpackage.jin0;
import defpackage.kin0;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.lin0;
import defpackage.lzm0;
import defpackage.mmw;
import defpackage.mo21;
import defpackage.mrg0;
import defpackage.msg0;
import defpackage.ny61;
import defpackage.ozm0;
import defpackage.pxm0;
import defpackage.qfh0;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.rwj;
import defpackage.sc;
import defpackage.sls;
import defpackage.srh0;
import defpackage.t1w;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u4s0;
import defpackage.v3n0;
import defpackage.whn0;
import defpackage.win0;
import defpackage.wwj;
import defpackage.xhn0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.xwj;
import defpackage.xzm0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.utils.ScootersCompassRotatableFloatButton;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersShortcutsLikeSlideableModalView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002½\u0001BÑ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\u00022\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000fH\u0014¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020CH\u0014¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020GH\u0014¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020>H\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000fH\u0014¢\u0006\u0004\bO\u0010BJ\u000f\u0010P\u001a\u00020\u000fH\u0014¢\u0006\u0004\bP\u0010BJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020>H\u0016¢\u0006\u0004\bU\u0010@J\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000fH\u0014¢\u0006\u0004\bY\u0010BJ!\u0010\\\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u000fH\u0016¢\u0006\u0004\b^\u0010BJ\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010BJ\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010BJ\u0017\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000fH\u0016¢\u0006\u0004\bi\u0010BJ\u0017\u0010k\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020GH\u0016¢\u0006\u0004\bk\u0010JJ\u0017\u0010m\u001a\u00020l2\u0006\u0010D\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u000fH\u0014¢\u0006\u0004\bo\u0010BJ\u0017\u0010r\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020>H\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u000fH\u0002¢\u0006\u0004\bw\u0010BJ\u000f\u0010x\u001a\u00020\u000fH\u0002¢\u0006\u0004\bx\u0010BJ\u0013\u0010z\u001a\u00020\u000f*\u00020yH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010}\u001a\u00020|H\u0002¢\u0006\u0004\b}\u0010~J\u0012\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0082\u0001\u0010BJ\u0011\u0010\u0083\u0001\u001a\u00020|H\u0002¢\u0006\u0005\b\u0083\u0001\u0010~J\u0011\u0010\u0084\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0084\u0001\u0010BJ\u0011\u0010\u0085\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0085\u0001\u0010BJ\u0011\u0010\u0086\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0086\u0001\u0010BJ\u0011\u0010\u0087\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0087\u0001\u0010BJ\u0011\u0010\u0088\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0088\u0001\u0010BJ\u0013\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020>H\u0002¢\u0006\u0005\b\u008d\u0001\u0010vR\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008e\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008f\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0090\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0091\u0001R\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0092\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0093\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0094\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0095\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0096\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0097\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0098\u0001R\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0099\u0001R!\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u009a\u0001R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u009b\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u009c\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010\u009d\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u009e\u0001R\u0017\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010\u009f\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010 \u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010¡\u0001R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010¦\u0001R\u0017\u0010§\u0001\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¬\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¬\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010¬\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¸\u0001\u001a\u00020G8TX\u0094\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/yandex/go/scooters/discovery/ScootersDiscoveryModalView;", "Lru/yandex/taxi/scooters/utils/ScootersShortcutsLikeSlideableModalView;", "Lwin0;", "Lrwj;", "Landroid/content/Context;", "context", "Lj5z;", "localeHelper", "Lah00;", "mapController", "Ltt2;", "appDispatchers", "Ltse;", "coroutineScope", "Lkotlin/Function0;", "Lzy11;", "onActiveOrdersClicked", "Lip11;", "typefaceDelegate", "Lgzr0;", "shortcutGridView", "La3v;", "focusCoordinator", "La850;", "navigationListener", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lfva0;", "performanceAnalytics", "Lh3y;", "Lru/yandex/taxi/design/utils/a;", "overlayShadowUtilLazy", "Lkotlin/Function1;", "Lxym0;", "onAttentionClicked", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lcom/yandex/go/scooters/discovery/j;", "scootersDiscoveryPresenter", "Lt4s0;", "shortcutsVisibilityTracker", "Lxhn0;", "scootersDiscoveryAnalytics", "Lwwj;", "discoveryUserLocationOverlay", "Llzm0;", "scootersAttentionViewDelegate", "Lxzm0;", "scootersBackgroundDelegateHolder", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "<init>", "(Landroid/content/Context;Lj5z;Lah00;Ltt2;Ltse;Lsls;Lip11;Lgzr0;La3v;La850;Lru/yandex/taxi/discovery/a;Lfva0;Lh3y;Ltls;Lru/yandex/taxi/layers/presentation/optimalview/c;Lcom/yandex/go/scooters/discovery/j;Lt4s0;Lxhn0;Lwwj;Llzm0;Lxzm0;Lg8n0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwin0;", "Le230;", "insetsType", "()Le230;", "", "canDragToExpandFromAnchored", "()Z", "onAttachedToWindow", "()V", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "", "contentTop", "onModalViewAppear", "(I)V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "onModalViewDisappear", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "canHandleScreenTracking", "", "screenName", "()Ljava/lang/String;", "onArrowClick", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "", "azimuth", "updateAzimuth", "(F)V", "showError", "count", "updateBadgeCount", "Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "refreshTopPadding", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "isOpened", "onAttentionHeaderChanged", "(Z)V", "updatePeekHeight", "showToolbar", "Landroid/widget/LinearLayout;", "createToolbar", "(Landroid/widget/LinearLayout;)V", "Landroid/view/View;", "createToolbarLogotype", "()Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "createLogotypeBackground", "()Landroid/graphics/drawable/Drawable;", "updateLogotypeShadow", "createToolbarTitle", "updateToolbarTopMargin", "removeToolbar", "showTopFade", "removeTopFade", "updateTopFadeConstraints", "Landroid/graphics/drawable/GradientDrawable;", "createTopGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "fallback", "updateAnchorHeight", "Lj5z;", "Lah00;", "Ltt2;", "Ltse;", "Lsls;", "Lip11;", "Lgzr0;", "La3v;", "La850;", "Lru/yandex/taxi/discovery/a;", "Lfva0;", "Lh3y;", "Ltls;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lcom/yandex/go/scooters/discovery/j;", "Lt4s0;", "Lxhn0;", "Lwwj;", "Llzm0;", "Lxzm0;", "Lg8n0;", "Lisj;", "discoveryCameraMoveHandler", "Lisj;", "Ljava/lang/Runnable;", "updatePeekHeightRunnable", "Lwhn0;", "topButtonContainer", "Lwhn0;", "toolbar", "Landroid/view/View;", "logotypeContainer", "logotypeShadow", "Landroid/widget/ImageView;", "logotype", "Landroid/widget/ImageView;", "topFade", "Ll8x;", "logotypeShadowJob", "Ll8x;", "getSlideableBackgroundAttrRes", "()I", "slideableBackgroundAttrRes", "Landroid/graphics/Rect;", "getWindowBounds", "()Landroid/graphics/Rect;", "windowBounds", "kin0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersDiscoveryModalView extends ScootersShortcutsLikeSlideableModalView<win0> implements rwj {
    public static final int $stable = 8;
    private final tt2 appDispatchers;
    private final tse coroutineScope;
    private final isj discoveryCameraMoveHandler;
    private final ru.yandex.taxi.discovery.a discoveryPresenter;
    private final wwj discoveryUserLocationOverlay;
    private final a3v focusCoordinator;
    private final j5z localeHelper;
    private ImageView logotype;
    private View logotypeContainer;
    private View logotypeShadow;
    private l8x logotypeShadowJob;
    private final ah00 mapController;
    private final ru.yandex.taxi.layers.presentation.optimalview.c mapObservationPresenter;
    private final a850 navigationListener;
    private final sls onActiveOrdersClicked;
    private final tls onAttentionClicked;
    private Runnable onBackPressedListener;
    private final h3y overlayShadowUtilLazy;
    private final fva0 performanceAnalytics;
    private final lzm0 scootersAttentionViewDelegate;
    private final xzm0 scootersBackgroundDelegateHolder;
    private final g8n0 scootersCompassRotatableFloatButtonFactory;
    private final xhn0 scootersDiscoveryAnalytics;
    private final j scootersDiscoveryPresenter;
    private final gzr0 shortcutGridView;
    private final t4s0 shortcutsVisibilityTracker;
    private View toolbar;
    private whn0 topButtonContainer;
    private View topFade;
    private final ip11 typefaceDelegate;
    private final Runnable updatePeekHeightRunnable;

    public ScootersDiscoveryModalView(Context context, j5z j5zVar, ah00 ah00Var, tt2 tt2Var, tse tseVar, sls slsVar, ip11 ip11Var, gzr0 gzr0Var, a3v a3vVar, a850 a850Var, ru.yandex.taxi.discovery.a aVar, fva0 fva0Var, h3y h3yVar, tls tlsVar, ru.yandex.taxi.layers.presentation.optimalview.c cVar, j jVar, t4s0 t4s0Var, xhn0 xhn0Var, wwj wwjVar, lzm0 lzm0Var, xzm0 xzm0Var, g8n0 g8n0Var) {
        super(context, 6);
        this.localeHelper = j5zVar;
        this.mapController = ah00Var;
        this.appDispatchers = tt2Var;
        this.coroutineScope = tseVar;
        this.onActiveOrdersClicked = slsVar;
        this.typefaceDelegate = ip11Var;
        this.shortcutGridView = gzr0Var;
        this.focusCoordinator = a3vVar;
        this.navigationListener = a850Var;
        this.discoveryPresenter = aVar;
        this.performanceAnalytics = fva0Var;
        this.overlayShadowUtilLazy = h3yVar;
        this.onAttentionClicked = tlsVar;
        this.mapObservationPresenter = cVar;
        this.scootersDiscoveryPresenter = jVar;
        this.shortcutsVisibilityTracker = t4s0Var;
        this.scootersDiscoveryAnalytics = xhn0Var;
        this.discoveryUserLocationOverlay = wwjVar;
        this.scootersAttentionViewDelegate = lzm0Var;
        this.scootersBackgroundDelegateHolder = xzm0Var;
        this.scootersCompassRotatableFloatButtonFactory = g8n0Var;
        this.discoveryCameraMoveHandler = new isj(ah00Var);
        this.updatePeekHeightRunnable = new jin0(this, 5);
        setOnAppearingListener(new sc(10, this));
    }

    private final Drawable createLogotypeBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int u = tje.u(28, getContext());
        gradientDrawable.setSize(u, u);
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(qje.t(xng0.bgMain, getContext()));
        gradientDrawable.setStroke(tje.u(2, getContext()), qje.t(xng0.bgMain, getContext()));
        return gradientDrawable;
    }

    private final void createToolbar(LinearLayout linearLayout) {
        linearLayout.addView(createToolbarLogotype());
        linearLayout.addView(createToolbarTitle());
    }

    private final View createToolbarLogotype() {
        int u = tje.u(28, getContext());
        GoFrameLayout goFrameLayout = new GoFrameLayout(getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(u, u));
        goFrameLayout.setVisibility(8);
        goFrameLayout.setClipChildren(false);
        goFrameLayout.setClipToPadding(false);
        this.logotypeContainer = goFrameLayout;
        xw31.F(goFrameLayout, null, null, Integer.valueOf(tje.u(4, goFrameLayout.getContext())), null);
        GoView goView = new GoView(goFrameLayout.getContext(), null, 0, 0, 14, null);
        goView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        this.logotypeShadow = goView;
        goView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        goFrameLayout.addView(goView);
        ScootersDiscoveryModalView$createToolbarLogotype$1$2 scootersDiscoveryModalView$createToolbarLogotype$1$2 = new ScootersDiscoveryModalView$createToolbarLogotype$1$2(goFrameLayout.getContext());
        scootersDiscoveryModalView$createToolbarLogotype$1$2.setLayoutParams(new ViewGroup.MarginLayoutParams(u, u));
        this.logotype = scootersDiscoveryModalView$createToolbarLogotype$1$2;
        scootersDiscoveryModalView$createToolbarLogotype$1$2.setBackground(createLogotypeBackground());
        scootersDiscoveryModalView$createToolbarLogotype$1$2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int u2 = tje.u(2, scootersDiscoveryModalView$createToolbarLogotype$1$2.getContext());
        scootersDiscoveryModalView$createToolbarLogotype$1$2.setPadding(u2, u2, u2, u2);
        scootersDiscoveryModalView$createToolbarLogotype$1$2.setLayoutParams(new FrameLayout.LayoutParams(u, u, 17));
        goFrameLayout.addView(scootersDiscoveryModalView$createToolbarLogotype$1$2);
        updateLogotypeShadow();
        return goFrameLayout;
    }

    private final View createToolbarTitle() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        robotoTextView.setTextSize(tje.s(mrg0.component_text_size_title, robotoTextView.getContext()));
        if (lin0.a.contains(this.localeHelper.c().getLanguage())) {
            robotoTextView.setTextTypeface(6);
        } else {
            robotoTextView.setTypeface(this.typefaceDelegate.b(robotoTextView.getContext()));
        }
        robotoTextView.setIncludeFontPadding(false);
        robotoTextView.setTextAlignment(4);
        robotoTextView.setText(robotoTextView.getContext().getString(kyh0.scooters));
        return robotoTextView;
    }

    private final GradientDrawable createTopGradientDrawable() {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        int t = qje.t(xng0.bgMain, getContext());
        int argb = Color.argb((int) (Color.alpha(t) * 0.0f), Color.red(t), Color.green(t), Color.blue(t));
        int t2 = qje.t(xng0.bgMain, getContext());
        return new GradientDrawable(orientation, new int[]{argb, Color.argb((int) (Color.alpha(t2) * 1.0f), Color.red(t2), Color.green(t2), Color.blue(t2))});
    }

    private final Rect getWindowBounds() {
        Rect rect = new Rect();
        getBottomSheet().getGlobalVisibleRect(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        return scootersDiscoveryModalView.shortcutGridView.getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onAttachedToWindow$lambda$0(ScootersDiscoveryModalView scootersDiscoveryModalView, View view) {
        ((win0) scootersDiscoveryModalView.getBinding()).a.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        Runnable runnable = scootersDiscoveryModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        scootersDiscoveryModalView.onActiveOrdersClicked.invoke();
    }

    private static final zy11 onAttachedToWindow$lambda$3(ScootersDiscoveryModalView scootersDiscoveryModalView, whn0 whn0Var) {
        whn0Var.c.setBadgeBackgroundColor(ru.yandex.taxi.design.utils.c.c(xng0.controlMain, scootersDiscoveryModalView));
        whn0Var.c.setBadgeTextColorAttr(xng0.textOnControl);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$4(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        if (scootersDiscoveryModalView.getCollapsedByUser()) {
            return;
        }
        scootersDiscoveryModalView.anchor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$5(ScootersDiscoveryModalView scootersDiscoveryModalView) {
        fva0.b(scootersDiscoveryModalView.performanceAnalytics, "ScootersDiscovery", PerformanceAnalytics$Type.Loading, null, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttentionHeaderChanged(boolean isOpened) {
        if (isOpened) {
            updatePeekHeight();
        } else {
            postDelayed(this.updatePeekHeightRunnable, 600L);
        }
    }

    private final void removeToolbar() {
        l8x l8xVar = this.logotypeShadowJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.logotypeShadowJob = null;
        View view = this.toolbar;
        if (view != null) {
            this.scootersBackgroundDelegateHolder.a.detach(view);
            this.logotypeContainer = null;
            this.logotypeShadow = null;
            this.logotype = null;
            this.toolbar = null;
        }
    }

    private final void removeTopFade() {
        View view = this.topFade;
        if (view != null) {
            this.scootersBackgroundDelegateHolder.a.detach(view);
            this.topFade = null;
        }
    }

    private final void showToolbar() {
        GoLinearLayout goLinearLayout = new GoLinearLayout(getContext(), null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setId(qfh0.scooters_discovery_toolbar);
        goLinearLayout.setGravity(17);
        goLinearLayout.setClipChildren(false);
        goLinearLayout.setClipToPadding(false);
        goLinearLayout.setVisibility(8);
        goLinearLayout.setAlpha(0.0f);
        createToolbar(goLinearLayout);
        this.scootersBackgroundDelegateHolder.a.attach(goLinearLayout);
        this.toolbar = goLinearLayout;
        updateToolbarTopMargin();
    }

    private final void showTopFade() {
        GoView goView = new GoView(getContext(), null, 0, 0, 14, null);
        goView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        goView.setBackground(createTopGradientDrawable());
        goView.setVisibility(8);
        goView.setAlpha(0.0f);
        goView.setTranslationZ(-1.0f);
        this.scootersBackgroundDelegateHolder.a.attach(goView);
        this.topFade = goView;
        updateTopFadeConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAnchorHeight(boolean fallback) {
        setBehaviorAnchorHeight(Integer.valueOf(tje.r(fallback ? msg0.scooters_discovery_fallback_anchor : msg0.scooters_discovery_anchor, getContext())));
    }

    private final void updateLogotypeShadow() {
        View view = this.logotypeShadow;
        if (view == null) {
            return;
        }
        l8x l8xVar = this.logotypeShadowJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.logotypeShadowJob = tje.N(this.coroutineScope, null, null, new ScootersDiscoveryModalView$updateLogotypeShadow$1(this, view, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePeekHeight() {
        ListItemComponent listItemComponent;
        int u = tje.u(80, getContext()) + getCurrentInsets().g;
        ozm0 ozm0Var = (ozm0) this.scootersAttentionViewDelegate;
        int i = 0;
        if (ozm0Var.f && (listItemComponent = ozm0Var.b) != null) {
            i = listItemComponent.getHeight();
        }
        setBehaviorPeekHeight(u + i);
    }

    private final void updateToolbarTopMargin() {
        View view = this.toolbar;
        if (view != null) {
            xw31.F(view, null, Integer.valueOf(tje.u(20, getContext())), null, null);
        }
    }

    private final void updateTopFadeConstraints() {
        final View view = this.topFade;
        if (view != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.scooters.discovery.ScootersDiscoveryModalView$updateTopFadeConstraints$lambda$0$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        ru.yandex.taxi.design.utils.c.C(ru.yandex.taxi.design.utils.c.h(88, this) + this.getCurrentInsets().b, view);
                        xw31.L(-this.getCurrentInsets().b, view);
                    }
                });
                return;
            }
            ru.yandex.taxi.design.utils.c.D(view.getLayoutParams().width, tje.u(88, getContext()) + getCurrentInsets().b, view);
            xw31.E(view, null, Integer.valueOf(-getCurrentInsets().b), null, null);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        View view = this.topFade;
        if (view != null) {
            view.setBackground(createTopGradientDrawable());
        }
        ImageView imageView = this.logotype;
        if (imageView != null) {
            imageView.setBackground(createLogotypeBackground());
        }
        updateLogotypeShadow();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public win0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_discovery_view, parent, false);
        if (inflate != null) {
            return new win0((GoFrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.scooters.utils.ScootersShortcutsLikeSlideableModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return false;
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        WindowInsets dispatchApplyWindowInsets = super.dispatchApplyWindowInsets(insets);
        updateToolbarTopMargin();
        updateTopFadeConstraints();
        return dispatchApplyWindowInsets;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getSlideableBackgroundAttrRes() {
        return xng0.bgTransparent;
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new ehn0(1, this), false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (behaviourState() == 3) {
            anchor();
        } else {
            expand();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        setDismissOnTouchOutside(false);
        updateAnchorHeight(false);
        setBehaviorPeekHeight(tje.u(80, getContext()));
        ((ozm0) this.scootersAttentionViewDelegate).a(this.shortcutGridView.getView(), new ScootersDiscoveryModalView$onAttachedToWindow$1(1, this, ScootersDiscoveryModalView.class, "onAttentionHeaderChanged", "onAttentionHeaderChanged(Z)V", 0), this.onAttentionClicked, new iin0(i, this));
        refreshNestedScrollView(this.shortcutGridView.getView());
        showTopFade();
        showToolbar();
        ScootersCompassRotatableFloatButton a = this.scootersCompassRotatableFloatButtonFactory.a();
        int i2 = 2;
        mmw mmwVar = new mmw(this.discoveryPresenter, i2);
        jin0 jin0Var = new jin0(this, i);
        jin0 jin0Var2 = new jin0(this, 1);
        View inflate = LayoutInflater.from(getContext()).inflate(srh0.scooters_discovery_above_card, (ViewGroup) this, false);
        int i3 = qfh0.active_orders_button;
        ScootersDiscoveryActiveOrdersButton scootersDiscoveryActiveOrdersButton = (ScootersDiscoveryActiveOrdersButton) cma1.O(i3, inflate);
        if (scootersDiscoveryActiveOrdersButton != null) {
            i3 = qfh0.back_button;
            BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) cma1.O(i3, inflate);
            if (backButtonIconComponent != null) {
                i3 = qfh0.geo_button;
                ScootersGeoButtonIconComponent scootersGeoButtonIconComponent = (ScootersGeoButtonIconComponent) cma1.O(i3, inflate);
                if (scootersGeoButtonIconComponent != null) {
                    i3 = qfh0.geo_control;
                    GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i3, inflate);
                    if (goFrameLayout != null) {
                        GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
                        whn0 whn0Var = new whn0(goConstraintLayout, scootersDiscoveryActiveOrdersButton, backButtonIconComponent, scootersGeoButtonIconComponent, goFrameLayout);
                        goConstraintLayout.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
                        addViewAboveCard(goConstraintLayout, 48, 0);
                        xw31.E(goConstraintLayout, null, null, null, Integer.valueOf(tje.u(8, getContext())));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 81;
                        goFrameLayout.addView(a, layoutParams);
                        scootersGeoButtonIconComponent.setDebounceClickListener(new v3n0(8, mmwVar));
                        backButtonIconComponent.setDebounceClickListener(new v3n0(9, jin0Var));
                        scootersDiscoveryActiveOrdersButton.setDebounceClickListener(new v3n0(10, jin0Var2));
                        onAttachedToWindow$lambda$3(this, whn0Var);
                        this.topButtonContainer = whn0Var;
                        this.mapObservationPresenter.Lg(this);
                        j jVar = this.scootersDiscoveryPresenter;
                        jVar.Bg(new kin0(this));
                        w wVar = jVar.C;
                        d dVar = new d(wVar.d());
                        tse Jg = jVar.Jg();
                        ScootersDiscoveryPresenter$listenAttention$$inlined$collectIn$1 scootersDiscoveryPresenter$listenAttention$$inlined$collectIn$1 = new ScootersDiscoveryPresenter$listenAttention$$inlined$collectIn$1(dVar, null, jVar);
                        int i4 = 3;
                        tje.N(Jg, null, null, scootersDiscoveryPresenter$listenAttention$$inlined$collectIn$1, 3);
                        tje.N(jVar.Jg(), null, null, new ScootersDiscoveryPresenter$listenFallback$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new h(new f(wVar.d()))), null, jVar), 3);
                        if (((Boolean) ((r0) jVar.J.b).getValue()).booleanValue()) {
                            tje.N(jVar.Jg(), null, null, new ScootersDiscoveryPresenter$focusOnStartIfNeeded$1(jVar, null), 3);
                        }
                        tje.N(jVar.Jg(), null, null, new ScootersDiscoveryPresenter$listenLogotype$1(jVar, null), 3);
                        tje.N(jVar.Jg(), null, null, new ScootersDiscoveryPresenter$listenActiveOrders$1(jVar, null), 3);
                        tje.N(jVar.Jg(), null, null, new ScootersDiscoveryPresenter$listenToDriverLicenseNotification$1(jVar, null), 3);
                        isj isjVar = this.discoveryCameraMoveHandler;
                        jin0 jin0Var3 = new jin0(this, i2);
                        jin0 jin0Var4 = new jin0(this, i4);
                        isjVar.d = jin0Var3;
                        isjVar.e = jin0Var4;
                        ((gh00) isjVar.a).e(isjVar.c);
                        xhn0 xhn0Var = this.scootersDiscoveryAnalytics;
                        co40 co40Var = xhn0Var.a;
                        pxm0 pxm0Var = xhn0Var.b;
                        String str = pxm0Var != null ? pxm0Var.b : null;
                        String str2 = pxm0Var != null ? pxm0Var.a : null;
                        co40Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str2 != null) {
                            hashMap.put("from_screen", str2);
                        }
                        if (str != null) {
                            hashMap.put("open_reason", str);
                        }
                        co40Var.a.a("ScootersDiscovery.Shown", hashMap, 1, new HashMap());
                        this.shortcutGridView.resume();
                        this.shortcutGridView.setDataLoadedCallback(new jin0(this, 4));
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    @Override // ru.yandex.taxi.scooters.utils.ScootersShortcutsLikeSlideableModalView, ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        t4s0 t4s0Var = this.shortcutsVisibilityTracker;
        ((u4s0) t4s0Var).d.set(getWindowBounds());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.updatePeekHeightRunnable);
        removeToolbar();
        removeTopFade();
        this.discoveryCameraMoveHandler.a();
        this.mapObservationPresenter.Cg();
        ozm0 ozm0Var = (ozm0) this.scootersAttentionViewDelegate;
        ozm0Var.a.Cg();
        ozm0Var.c = null;
        ozm0Var.f = false;
        ozm0Var.e = null;
        ozm0Var.b = null;
        this.scootersDiscoveryPresenter.Cg();
        xhn0 xhn0Var = this.scootersDiscoveryAnalytics;
        co40 co40Var = xhn0Var.a;
        pxm0 pxm0Var = xhn0Var.b;
        String str = pxm0Var != null ? pxm0Var.b : null;
        String str2 = pxm0Var != null ? pxm0Var.a : null;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("from_screen", str2);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        co40Var.a.a("ScootersDiscovery.Closed", hashMap, 1, new HashMap());
        this.shortcutGridView.pause();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        updatePeekHeight();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.focusCoordinator.q3(qoi0.a(ScootersDiscoveryModalView.class), 0, tje.r(msg0.scooters_top_notification_focus_rect_margin, getContext()), 0, tje.r(msg0.scooters_discovery_anchor, getContext()));
        ((gh00) this.mapController).L(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        this.focusCoordinator.Lc(qoi0.a(ScootersDiscoveryModalView.class), null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void refreshTopPadding() {
        super.refreshTopPadding();
        updateToolbarTopMargin();
        updateTopFadeConstraints();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "scooters";
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = onBackPressedListener;
    }

    public void showError() {
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.updateAzimuth(azimuth);
        }
    }

    @Override // defpackage.rwj
    public void updateBadgeCount(int count) {
        whn0 whn0Var = this.topButtonContainer;
        if (whn0Var != null) {
            BackButtonIconComponent backButtonIconComponent = whn0Var.c;
            if (count > 0) {
                backButtonIconComponent.setBadgeText(String.valueOf(count));
            } else {
                backButtonIconComponent.setBadgeText(null);
            }
        }
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a(userLocation);
        }
    }
}
