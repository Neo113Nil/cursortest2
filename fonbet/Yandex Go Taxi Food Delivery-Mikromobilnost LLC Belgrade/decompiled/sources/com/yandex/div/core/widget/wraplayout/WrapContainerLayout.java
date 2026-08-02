package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.widget.b;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import defpackage.b6w;
import defpackage.ffx;
import defpackage.g8e;
import defpackage.gpl;
import defpackage.hpl;
import defpackage.kgx;
import defpackage.m810;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q5z;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.t5w;
import defpackage.w511;
import defpackage.xbi0;
import defpackage.y83;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b/\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002¹\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u0019\u0010$\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010%J\u0019\u0010'\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010%J\u001f\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J7\u00103\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J'\u00108\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020)H\u0002¢\u0006\u0004\b;\u0010.J\u0017\u0010<\u001a\u00020\f2\u0006\u0010:\u001a\u00020)H\u0002¢\u0006\u0004\b<\u0010.J/\u0010?\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0018H\u0002¢\u0006\u0004\b?\u0010@J7\u0010C\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\bE\u0010\u0017J\u001f\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020F2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010\u0017J\u001f\u0010L\u001a\u00020\u00072\u0006\u0010G\u001a\u00020F2\u0006\u0010K\u001a\u00020\u0007H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bN\u0010\u001fJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bO\u0010\u001fJ7\u0010P\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010QJ7\u0010R\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010QJC\u0010P\u001a\u0004\u0018\u00010\f2\b\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010UJ\u0019\u0010V\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\bV\u0010%J\u0019\u0010W\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\bW\u0010%R0\u0010Y\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b]\u0010^\u001a\u0004\b[\u0010!\"\u0004\b\\\u0010\u0012R1\u0010e\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b`\u0010a\u0012\u0004\bd\u0010^\u001a\u0004\bb\u0010!\"\u0004\bc\u0010\u0012R1\u0010j\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bf\u0010a\u0012\u0004\bi\u0010^\u001a\u0004\bg\u0010!\"\u0004\bh\u0010\u0012R/\u0010p\u001a\u0004\u0018\u00010S2\b\u0010_\u001a\u0004\u0018\u00010S8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010a\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR/\u0010t\u001a\u0004\u0018\u00010S2\b\u0010_\u001a\u0004\u0018\u00010S8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010a\u001a\u0004\br\u0010m\"\u0004\bs\u0010oR\u0016\u0010u\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020)0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010z\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010ZR\u0016\u0010{\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010ZR\u0016\u0010|\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010ZR\u0016\u0010}\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010ZR\u0016\u0010~\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010ZR\u0016\u0010\u007f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010ZR\u0018\u0010\u0080\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010ZR\u0018\u0010\u0081\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010ZR\u0018\u0010\u0082\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010ZR\u0018\u0010\u0083\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010ZR\u0018\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010ZR\u0018\u0010\u0085\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010ZR\u0018\u0010\u0086\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010ZR\u001c\u0010\u0088\u0001\u001a\u00070\u0087\u0001R\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010ZR3\u0010\u0091\u0001\u001a\u00030\u008b\u00012\u0007\u0010_\u001a\u00030\u008b\u00018V@VX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010a\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010!R\u0016\u0010\u0095\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010!R\u0016\u0010\u0097\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010!R\u0016\u0010\u0099\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010!R\u0016\u0010\u009b\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010!R\u0016\u0010\u009d\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010!R\u0016\u0010\u009f\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010!R\u0016\u0010¡\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010!R\u0016\u0010£\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010!R\u0016\u0010¥\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010!R\u0016\u0010§\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010!R\u0016\u0010©\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010!R\u001b\u0010ª\u0001\u001a\u00020\u0018*\u00020F8BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u001b\u0010\u00ad\u0001\u001a\u00020\u0018*\u00020F8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010«\u0001R\u001d\u0010®\u0001\u001a\u00020\u0018*\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010±\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010!R\u0016\u0010³\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010!R\u0016\u0010µ\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010!R\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006º\u0001"}, d2 = {"Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Ly83;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "left", "top", "right", "bottom", "Lzy11;", "setSeparatorMargins", "(IIII)V", "setLineSeparatorMargins", "px", "setItemSpacing", "(I)V", "setLineSpacing", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "getBaseline", "()I", "calculateLines", "mode", "showSeparatorAtStart", "(I)Z", "showSeparatorBetween", "showSeparatorAtEnd", "childIndex", "Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$a;", "line", "addLineIfNeeded", "(ILcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$a;)V", "addLine", "(Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$a;)V", "maxSize", "currentLength", "childLength", "lineItemsCount", "isWrapRequired", "(IIIII)Z", "measureSpec", "crossAlignment", "paddingAlongCrossAxis", "determineCrossSize", "(III)V", "spaceLine", "addEdgeSpace", "addSpaceBetweenLines", "size", "isCrossAxis", "getSize", "(IIIZ)I", ClidProvider.STATE, "tooSmallState", "getState", "(IIIII)I", "layoutHorizontal", "Landroid/view/View;", "view", "getTopOffsetForHorizontalLayout", "(Landroid/view/View;Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$a;)I", "layoutVertical", "lineWidth", "getLeftOffsetForVerticalLayout", "(Landroid/view/View;I)I", "drawSeparatorsHorizontal", "drawSeparatorsVertical", "drawSeparator", "(Landroid/graphics/Canvas;IIII)V", "drawLineSeparator", "Landroid/graphics/drawable/Drawable;", "separator", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;IIII)Lzy11;", "showLeftSeparator", "showRightSeparator", "value", "wrapDirection", CA20Status.STATUS_USER_I, "getWrapDirection", "setWrapDirection", "getWrapDirection$annotations", "()V", "<set-?>", "showSeparators$delegate", "Lxbi0;", "getShowSeparators", "setShowSeparators", "getShowSeparators$annotations", "showSeparators", "showLineSeparators$delegate", "getShowLineSeparators", "setShowLineSeparators", "getShowLineSeparators$annotations", "showLineSeparators", "separatorDrawable$delegate", "getSeparatorDrawable", "()Landroid/graphics/drawable/Drawable;", "setSeparatorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "separatorDrawable", "lineSeparatorDrawable$delegate", "getLineSeparatorDrawable", "setLineSeparatorDrawable", "lineSeparatorDrawable", "isRowDirection", "Z", "", "lines", "Ljava/util/List;", "childState", "separatorMarginTop", "separatorMarginBottom", "separatorMarginLeft", "separatorMarginRight", "itemSpacingPx", "lineSpacingPx", "lineSeparatorMarginTop", "lineSeparatorMarginBottom", "lineSeparatorMarginLeft", "lineSeparatorMarginRight", "middleLineSeparatorOffset", "edgeLineSeparatorOffset", "Lhpl;", "offsetsHolder", "Lhpl;", "tempSumCrossSize", "", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "getSeparatorLength", "separatorLength", "getLineSeparatorLength", "lineSeparatorLength", "getBetweenItemsSpacing", "betweenItemsSpacing", "getBetweenLinesSpacing", "betweenLinesSpacing", "getEdgeSeparatorsLength", "edgeSeparatorsLength", "getEdgeLineSeparatorsLength", "edgeLineSeparatorsLength", "getStartSeparatorLength", "startSeparatorLength", "getMiddleSeparatorLength", "middleSeparatorLength", "getEndSeparatorLength", "endSeparatorLength", "getStartLineSeparatorLength", "startLineSeparatorLength", "getMiddleLineSeparatorLength", "middleLineSeparatorLength", "getEndLineSeparatorLength", "endLineSeparatorLength", "isHidden", "(Landroid/view/View;)Z", "getHasIncorrectSize", "hasIncorrectSize", "isIncorrectForCrossAxis", "(Ljava/lang/Integer;)Z", "getVisibleLinesCount", "visibleLinesCount", "getLargestMainSize", "largestMainSize", "getSumOfCrossSize", "sumOfCrossSize", "getFirstVisibleLine", "()Lcom/yandex/div/core/widget/wraplayout/WrapContainerLayout$a;", "firstVisibleLine", "a", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class WrapContainerLayout extends DivViewGroup implements y83 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("showSeparators", 0, "getShowSeparators()I", WrapContainerLayout.class), oyr.B(qoi0.a, WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", 0), new MutablePropertyReference1Impl("separatorDrawable", 0, "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", WrapContainerLayout.class), new MutablePropertyReference1Impl("lineSeparatorDrawable", 0, "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", WrapContainerLayout.class), new MutablePropertyReference1Impl("aspectRatio", 0, "getAspectRatio()F", WrapContainerLayout.class)};

    /* renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    private final xbi0 aspectRatio;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;
    private int itemSpacingPx;

    /* renamed from: lineSeparatorDrawable$delegate, reason: from kotlin metadata */
    private final xbi0 lineSeparatorDrawable;
    private int lineSeparatorMarginBottom;
    private int lineSeparatorMarginLeft;
    private int lineSeparatorMarginRight;
    private int lineSeparatorMarginTop;
    private int lineSpacingPx;
    private final List<a> lines;
    private int middleLineSeparatorOffset;
    private final hpl offsetsHolder;

    /* renamed from: separatorDrawable$delegate, reason: from kotlin metadata */
    private final xbi0 separatorDrawable;
    private int separatorMarginBottom;
    private int separatorMarginLeft;
    private int separatorMarginRight;
    private int separatorMarginTop;

    /* renamed from: showLineSeparators$delegate, reason: from kotlin metadata */
    private final xbi0 showLineSeparators;

    /* renamed from: showSeparators$delegate, reason: from kotlin metadata */
    private final xbi0 showSeparators;
    private int tempSumCrossSize;
    private int wrapDirection;

    public WrapContainerLayout(Context context) {
        super(context, null, 0, 6, null);
        this.showSeparators = q5z.o(0);
        this.showLineSeparators = q5z.o(0);
        this.separatorDrawable = q5z.o(null);
        this.lineSeparatorDrawable = q5z.o(null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new hpl();
        this.aspectRatio = b.a();
    }

    private final void addEdgeSpace(a spaceLine) {
        this.lines.add(0, spaceLine);
        this.lines.add(spaceLine);
    }

    private final void addLine(a line) {
        this.lines.add(line);
        if (line.i() > 0) {
            line.o(Math.max(line.b(), line.j() + line.i()));
        }
        this.tempSumCrossSize = line.b() + this.tempSumCrossSize;
    }

    private final void addLineIfNeeded(int childIndex, a line) {
        if (childIndex != getChildCount() - 1 || line.g() == 0) {
            return;
        }
        addLine(line);
    }

    private final void addSpaceBetweenLines(a spaceLine) {
        for (int i = 1; i < this.lines.size(); i += 2) {
            this.lines.add(i, spaceLine);
        }
    }

    private final void calculateLines(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int edgeSeparatorsLength;
        int i2;
        int i3;
        int i4;
        int i5;
        int max;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i6 = this.isRowDirection ? widthMeasureSpec : heightMeasureSpec;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        a aVar = new a(edgeSeparatorsLength2, 5);
        int i7 = 0;
        int i8 = 0;
        int i9 = Integer.MIN_VALUE;
        while (true) {
            if (!(i7 < getChildCount())) {
                return;
            }
            int i10 = i7 + 1;
            View childAt = getChildAt(i7);
            if (childAt == null) {
                ny61.s();
                return;
            }
            int i11 = i8 + 1;
            if (i8 < 0) {
                scc.m();
                throw null;
            }
            if (isHidden(childAt)) {
                aVar.q(aVar.e() + 1);
                aVar.r(aVar.f() + 1);
                addLineIfNeeded(i8, aVar);
                i5 = mode;
                i3 = size;
                max = i9;
            } else {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release();
                int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release();
                if (this.isRowDirection) {
                    i = horizontalMargins$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.tempSumCrossSize;
                } else {
                    i = horizontalMargins$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i12 = verticalMargins$div_release + edgeSeparatorsLength;
                gpl gplVar = DivViewGroup.Companion;
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int minimumWidth = childAt.getMinimumWidth();
                int maxWidth = divLayoutParams.getMaxWidth();
                gplVar.getClass();
                int i14 = i9;
                childAt.measure(gpl.a(widthMeasureSpec, i, i13, minimumWidth, maxWidth), gpl.a(heightMeasureSpec, i12, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, childAt.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, childAt.getMeasuredState());
                int horizontalMargins$div_release2 = divLayoutParams.getHorizontalMargins$div_release() + childAt.getMeasuredWidth();
                int verticalMargins$div_release2 = divLayoutParams.getVerticalMargins$div_release() + childAt.getMeasuredHeight();
                if (this.isRowDirection) {
                    i2 = horizontalMargins$div_release2;
                } else {
                    i2 = verticalMargins$div_release2;
                    verticalMargins$div_release2 = horizontalMargins$div_release2;
                }
                int i15 = mode;
                i3 = size;
                if (isWrapRequired(i15, i3, aVar.h(), i2, aVar.f())) {
                    if (aVar.g() > 0) {
                        addLine(aVar);
                    }
                    aVar = new a(i8, edgeSeparatorsLength2, 1);
                    i4 = Integer.MIN_VALUE;
                } else {
                    if (aVar.f() > 0) {
                        aVar.s(aVar.h() + getBetweenItemsSpacing());
                    }
                    aVar.r(aVar.f() + 1);
                    i4 = i14;
                }
                if (this.isRowDirection && divLayoutParams.getIsBaselineAligned()) {
                    i5 = i15;
                    aVar.t(Math.max(aVar.i(), childAt.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    aVar.u(Math.max(aVar.j(), (childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - childAt.getBaseline()));
                } else {
                    i5 = i15;
                }
                aVar.s(aVar.h() + i2);
                max = Math.max(i4, verticalMargins$div_release2);
                aVar.o(Math.max(aVar.b(), max));
                addLineIfNeeded(i8, aVar);
            }
            i9 = max;
            size = i3;
            i7 = i10;
            i8 = i11;
            mode = i5;
        }
    }

    private final void determineCrossSize(int measureSpec, int crossAlignment, int paddingAlongCrossAxis) {
        int i = 0;
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(measureSpec) == 1073741824) {
            int size = View.MeasureSpec.getSize(measureSpec);
            if (this.lines.size() == 1) {
                this.lines.get(0).o(size - paddingAlongCrossAxis);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + paddingAlongCrossAxis;
            int i2 = 7;
            if (crossAlignment != 1) {
                if (crossAlignment != 5) {
                    if (crossAlignment != 16) {
                        if (crossAlignment != 80) {
                            if (crossAlignment != 16777216) {
                                if (crossAlignment != 33554432) {
                                    if (crossAlignment != 67108864) {
                                        if (crossAlignment != 268435456) {
                                            if (crossAlignment != 536870912) {
                                                if (crossAlignment != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    a aVar = new a(i, i2);
                                    gpl gplVar = DivViewGroup.Companion;
                                    int size2 = this.lines.size();
                                    gplVar.getClass();
                                    int b = m810.b(sumOfCrossSize / (size2 + 1));
                                    aVar.o(b);
                                    int i3 = b / 2;
                                    this.middleLineSeparatorOffset = i3;
                                    this.edgeLineSeparatorOffset = i3;
                                    addSpaceBetweenLines(aVar);
                                    addEdgeSpace(aVar);
                                    return;
                                }
                                a aVar2 = new a(i, i2);
                                gpl gplVar2 = DivViewGroup.Companion;
                                float f = sumOfCrossSize;
                                int size3 = this.lines.size();
                                gplVar2.getClass();
                                int b2 = m810.b(size3 == 1 ? 0.0f : f / (size3 - 1));
                                aVar2.o(b2);
                                this.middleLineSeparatorOffset = b2 / 2;
                                addSpaceBetweenLines(aVar2);
                                return;
                            }
                            a aVar3 = new a(i, i2);
                            gpl gplVar3 = DivViewGroup.Companion;
                            int size4 = this.lines.size();
                            gplVar3.getClass();
                            int b3 = m810.b(sumOfCrossSize / (size4 * 2));
                            aVar3.o(b3);
                            this.middleLineSeparatorOffset = b3;
                            this.edgeLineSeparatorOffset = b3 / 2;
                            while (i < this.lines.size()) {
                                this.lines.add(i, aVar3);
                                this.lines.add(i + 2, aVar3);
                                i += 3;
                            }
                            return;
                        }
                    }
                }
                a aVar4 = new a(i, i2);
                aVar4.o(sumOfCrossSize);
                this.lines.add(0, aVar4);
                return;
            }
            a aVar5 = new a(i, i2);
            aVar5.o(sumOfCrossSize / 2);
            addEdgeSpace(aVar5);
        }
    }

    private final void drawLineSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getLineSeparatorDrawable(), canvas, left + this.lineSeparatorMarginLeft, top - this.lineSeparatorMarginTop, right - this.lineSeparatorMarginRight, bottom + this.lineSeparatorMarginBottom);
    }

    private final zy11 drawSeparator(Drawable separator, Canvas canvas, int left, int top, int right, int bottom) {
        if (separator == null) {
            return null;
        }
        float f = (left + right) / 2.0f;
        float f2 = (top + bottom) / 2.0f;
        float intrinsicWidth = separator.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = separator.getIntrinsicHeight() / 2.0f;
        separator.setBounds((int) (f - intrinsicWidth), (int) (f2 - intrinsicHeight), (int) (f + intrinsicWidth), (int) (f2 + intrinsicHeight));
        separator.draw(canvas);
        return zy11.a;
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int i;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            a firstVisibleLine = getFirstVisibleLine();
            int a2 = firstVisibleLine != null ? firstVisibleLine.a() - firstVisibleLine.b() : 0;
            ref$IntRef.element = a2;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, a2 - this.edgeLineSeparatorOffset);
        }
        boolean z = false;
        for (a aVar : this.lines) {
            if (aVar.g() != 0) {
                int a3 = aVar.a();
                ref$IntRef2.element = a3;
                ref$IntRef.element = a3 - aVar.b();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                b6w M = ffx.M(aVar.d(), aVar.f(), this);
                int i2 = M.a;
                int i3 = M.b;
                int i4 = M.c;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    i = 0;
                    boolean z2 = true;
                    while (true) {
                        View childAt = getChildAt(i2);
                        if (childAt != null && !isHidden(childAt)) {
                            DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            i = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z2) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - aVar.c());
                                }
                                z2 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - ((int) (aVar.l() / 2.0f)));
                            }
                        }
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 += i4;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, aVar.c() + i + getSeparatorLength());
                }
                z = true;
            }
        }
        if (ref$IntRef2.element <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef.element, i, ref$IntRef2.element);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            a firstVisibleLine = getFirstVisibleLine();
            int k = firstVisibleLine != null ? firstVisibleLine.k() - firstVisibleLine.b() : 0;
            ref$IntRef.element = k;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, k - this.edgeLineSeparatorOffset);
        }
        Iterator it = ffx.M(0, this.lines.size(), this).iterator();
        boolean z = false;
        while (it.hasNext()) {
            a aVar = this.lines.get(((t5w) it).nextInt());
            if (aVar.g() != 0) {
                int k2 = aVar.k();
                ref$IntRef2.element = k2;
                ref$IntRef.element = k2 - aVar.b();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                boolean z2 = true;
                z = getLineSeparatorDrawable() != null;
                int f = aVar.f();
                int i = 0;
                for (int i2 = 0; i2 < f; i2++) {
                    View childAt = getChildAt(aVar.d() + i2);
                    if (childAt != null && !isHidden(childAt)) {
                        DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        i = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z2) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - aVar.c());
                            }
                            z2 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - ((int) (aVar.l() / 2.0f)));
                        }
                    }
                }
                if (i > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, aVar.c() + i + getSeparatorLength());
                }
            }
        }
        if (ref$IntRef2.element <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, ref$IntRef.element, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef2.element, i);
    }

    private final int getBetweenItemsSpacing() {
        return showSeparatorBetween(getShowSeparators()) ? getSeparatorLength() : this.itemSpacingPx;
    }

    private final int getBetweenLinesSpacing() {
        return showSeparatorBetween(getShowLineSeparators()) ? getLineSeparatorLength() : this.lineSpacingPx;
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final a getFirstVisibleLine() {
        Object obj = null;
        if (this.isRowDirection || !ffx.W(this)) {
            Iterator<T> it = this.lines.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((a) next).m()) {
                    obj = next;
                    break;
                }
            }
            return (a) obj;
        }
        List<a> list = this.lines;
        ListIterator<a> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((a) previous).m()) {
                obj = previous;
                break;
            }
        }
        return (a) obj;
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((a) it.next()).h());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((a) it.next()).h());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int lineWidth) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int layoutDirection = getLayoutDirection();
        gpl gplVar = DivViewGroup.Companion;
        int gravity = divLayoutParams.getGravity();
        gplVar.getClass();
        int absoluteGravity = Gravity.getAbsoluteGravity(125829127 & gravity, layoutDirection);
        return absoluteGravity != 1 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (lineWidth - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((lineWidth - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i = this.separatorMarginBottom;
        }
        return intrinsicHeight + i;
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    private final int getSize(int mode, int size, int maxSize, boolean isCrossAxis) {
        if (mode == Integer.MIN_VALUE) {
            return isCrossAxis ? Math.min(size, maxSize) : (maxSize <= size && getVisibleLinesCount() <= 1) ? maxSize : size;
        }
        if (mode != 0) {
            if (mode != 1073741824) {
                ny61.r(oyr.i(mode, "Unknown size mode is set: "));
                return 0;
            }
        }
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getState(int mode, int state, int size, int maxSize, int tooSmallState) {
        return (mode != 0 && size < maxSize) ? View.combineMeasuredStates(state, tooSmallState) : state;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((a) it.next()).b();
        }
        int edgeLineSeparatorsLength = i + getEdgeLineSeparatorsLength();
        return g8e.d(getVisibleLinesCount(), 1, getBetweenLinesSpacing(), edgeLineSeparatorsLength);
    }

    private final int getTopOffsetForHorizontalLayout(View view, a line) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        gpl gplVar = DivViewGroup.Companion;
        int gravity = divLayoutParams.getGravity();
        gplVar.getClass();
        int i = 1879048304 & gravity;
        return i != 16 ? i != 80 ? divLayoutParams.getIsBaselineAligned() ? Math.max(line.i() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) : ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin : (line.b() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : (((line.b() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
    }

    private final int getVisibleLinesCount() {
        List<a> list = this.lines;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).g() > 0 && (i = i + 1) < 0) {
                scc.l();
                throw null;
            }
        }
        return i;
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }

    private final boolean isHidden(View view) {
        return view.getVisibility() == 8 || getHasIncorrectSize(view);
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final boolean isWrapRequired(int mode, int maxSize, int currentLength, int childLength, int lineItemsCount) {
        return mode != 0 && maxSize < (currentLength + childLength) + (lineItemsCount != 0 ? getBetweenItemsSpacing() : 0);
    }

    private final void layoutHorizontal(int left, int right) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), getLayoutDirection());
        boolean z = false;
        for (a aVar : this.lines) {
            float h = (right - left) - aVar.h();
            hpl hplVar = this.offsetsHolder;
            hplVar.a(h, absoluteGravity, aVar.g());
            float paddingLeft = getPaddingLeft() + (ffx.W(this) ? getEndSeparatorLength() : getStartSeparatorLength()) + hplVar.a;
            aVar.w(hplVar.b);
            aVar.p(hplVar.c);
            if (aVar.g() > 0) {
                if (z) {
                    paddingTop += getBetweenLinesSpacing();
                }
                z = true;
            }
            b6w M = ffx.M(aVar.d(), aVar.f(), this);
            int i = M.a;
            int i2 = M.b;
            int i3 = M.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                boolean z2 = false;
                while (true) {
                    View childAt = getChildAt(i);
                    if (childAt != null && !isHidden(childAt)) {
                        DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                        float f = paddingLeft + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z2) {
                            f += getBetweenItemsSpacing();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(childAt, aVar) + paddingTop;
                        childAt.layout(m810.b(f), topOffsetForHorizontalLayout, childAt.getMeasuredWidth() + m810.b(f), childAt.getMeasuredHeight() + topOffsetForHorizontalLayout);
                        paddingLeft = aVar.l() + childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + f;
                        z2 = true;
                    } else if (getHasIncorrectSize(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                    if (i != i2) {
                        i += i3;
                    }
                }
            }
            paddingTop += aVar.b();
            aVar.v(m810.b(paddingLeft));
            aVar.n(paddingTop);
        }
    }

    private final void layoutVertical(int top, int bottom) {
        int paddingLeft = getPaddingLeft() + (ffx.W(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator it = ffx.M(0, this.lines.size(), this).iterator();
        boolean z = false;
        while (it.hasNext()) {
            a aVar = this.lines.get(((t5w) it).nextInt());
            float h = (bottom - top) - aVar.h();
            hpl hplVar = this.offsetsHolder;
            hplVar.a(h, getVerticalGravity$div_release(), aVar.g());
            float paddingTop = getPaddingTop() + getStartSeparatorLength() + hplVar.a;
            aVar.w(hplVar.b);
            aVar.p(hplVar.c);
            if (aVar.g() > 0) {
                if (z) {
                    paddingLeft += getBetweenLinesSpacing();
                }
                z = true;
            }
            int f = aVar.f();
            boolean z2 = false;
            for (int i = 0; i < f; i++) {
                View childAt = getChildAt(aVar.d() + i);
                if (childAt != null && !isHidden(childAt)) {
                    DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                    float f2 = paddingTop + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z2) {
                        f2 += getBetweenItemsSpacing();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(childAt, aVar.b()) + paddingLeft;
                    childAt.layout(leftOffsetForVerticalLayout, m810.b(f2), childAt.getMeasuredWidth() + leftOffsetForVerticalLayout, childAt.getMeasuredHeight() + m810.b(f2));
                    z2 = true;
                    paddingTop = aVar.l() + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + f2;
                } else if (getHasIncorrectSize(childAt)) {
                    childAt.layout(0, 0, 0, 0);
                }
            }
            paddingLeft += aVar.b();
            aVar.v(paddingLeft);
            aVar.n(m810.b(paddingTop));
        }
    }

    private final boolean showLeftSeparator(int mode) {
        return ffx.W(this) ? showSeparatorAtEnd(mode) : showSeparatorAtStart(mode);
    }

    private final boolean showRightSeparator(int mode) {
        return ffx.W(this) ? showSeparatorAtStart(mode) : showSeparatorAtEnd(mode);
    }

    private final boolean showSeparatorAtEnd(int mode) {
        return (mode & 4) != 0;
    }

    private final boolean showSeparatorAtStart(int mode) {
        return (mode & 1) != 0;
    }

    private final boolean showSeparatorBetween(int mode) {
        return (mode & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        a firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + firstVisibleLine.i();
    }

    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable.getValue(this, $$delegatedProperties[3]);
    }

    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable.getValue(this, $$delegatedProperties[2]);
    }

    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getShowSeparators() {
        return ((Number) this.showSeparators.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.isRowDirection) {
            layoutHorizontal(left, right);
        } else {
            layoutVertical(top, bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int mode;
        int size;
        int i2;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        if (getAspectRatio() != 0.0f && mode2 == 1073741824) {
            int b = m810.b(size2 / getAspectRatio());
            size = b;
            i = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
            mode = 1073741824;
        } else {
            i = heightMeasureSpec;
            mode = View.MeasureSpec.getMode(heightMeasureSpec);
            size = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        calculateLines(widthMeasureSpec, i);
        if (this.isRowDirection) {
            determineCrossSize(i, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(widthMeasureSpec, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int verticalPaddings$div_release = this.isRowDirection ? getVerticalPaddings$div_release() + getSumOfCrossSize() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, 16777216);
        int resolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), widthMeasureSpec, this.childState);
        if (!this.isRowDirection || getAspectRatio() == 0.0f || mode2 == 1073741824) {
            i2 = mode;
        } else {
            size = m810.b((16777215 & resolveSizeAndState) / getAspectRatio());
            i = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i2 = 1073741824;
        }
        int i3 = size;
        this.childState = getState(i2, this.childState, i3, verticalPaddings$div_release, 256);
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(getSize(i2, i3, verticalPaddings$div_release, this.isRowDirection), i, this.childState));
    }

    @Override // defpackage.y83
    public void setAspectRatio(float f) {
        this.aspectRatio.setValue(this, $$delegatedProperties[4], Float.valueOf(f));
    }

    public final void setItemSpacing(int px) {
        if (this.itemSpacingPx != px) {
            this.itemSpacingPx = px;
            requestLayout();
        }
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        this.lineSeparatorDrawable.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setLineSeparatorMargins(int left, int top, int right, int bottom) {
        this.lineSeparatorMarginLeft = left;
        this.lineSeparatorMarginRight = right;
        this.lineSeparatorMarginTop = top;
        this.lineSeparatorMarginBottom = bottom;
        requestLayout();
    }

    public final void setLineSpacing(int px) {
        if (this.lineSpacingPx != px) {
            this.lineSpacingPx = px;
            requestLayout();
        }
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.separatorDrawable.setValue(this, $$delegatedProperties[2], drawable);
    }

    public final void setSeparatorMargins(int left, int top, int right, int bottom) {
        this.separatorMarginLeft = left;
        this.separatorMarginRight = right;
        this.separatorMarginTop = top;
        this.separatorMarginBottom = bottom;
        requestLayout();
    }

    public final void setShowLineSeparators(int i) {
        this.showLineSeparators.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setShowSeparators(int i) {
        this.showSeparators.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setWrapDirection(int i) {
        if (this.wrapDirection != i) {
            this.wrapDirection = i;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    w511.d(this.wrapDirection, "Invalid value for the wrap direction is set: ");
                    return;
                }
                z = false;
            }
            this.isRowDirection = z;
            requestLayout();
        }
    }

    /* loaded from: classes11.dex */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public float k;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = -1;
        }

        public final int a() {
            return this.h;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.j;
        }

        public final int d() {
            return this.a;
        }

        public final int e() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int f() {
            return this.c;
        }

        public final int g() {
            return this.c - this.i;
        }

        public final int h() {
            return this.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final int i() {
            return this.e;
        }

        public final int j() {
            return this.f;
        }

        public final int k() {
            return this.g;
        }

        public final float l() {
            return this.k;
        }

        public final boolean m() {
            return g() > 0;
        }

        public final void n(int i) {
            this.h = i;
        }

        public final void o(int i) {
            this.d = i;
        }

        public final void p(int i) {
            this.j = i;
        }

        public final void q(int i) {
            this.i = i;
        }

        public final void r(int i) {
            this.c = i;
        }

        public final void s(int i) {
            this.b = i;
        }

        public final void t(int i) {
            this.e = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WrapLine(firstIndex=");
            sb.append(this.a);
            sb.append(", mainSize=");
            sb.append(this.b);
            sb.append(", itemCount=");
            return oyr.s(sb, this.c, ')');
        }

        public final void u(int i) {
            this.f = i;
        }

        public final void v(int i) {
            this.g = i;
        }

        public final void w(float f) {
            this.k = f;
        }

        public /* synthetic */ a(int i, int i2) {
            this(0, (i2 & 2) != 0 ? 0 : i, 0);
        }

        public a() {
            this(0, 7);
        }
    }

    private final void drawSeparator(Canvas canvas, int left, int top, int right, int bottom) {
        drawSeparator(getSeparatorDrawable(), canvas, left + this.separatorMarginLeft, top - this.separatorMarginTop, right - this.separatorMarginRight, bottom + this.separatorMarginBottom);
    }
}
