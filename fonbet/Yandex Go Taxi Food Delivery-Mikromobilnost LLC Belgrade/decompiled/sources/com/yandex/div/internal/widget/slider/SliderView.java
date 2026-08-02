package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import defpackage.apf;
import defpackage.br60;
import defpackage.ffx;
import defpackage.hps0;
import defpackage.jl40;
import defpackage.m810;
import defpackage.ops0;
import defpackage.pps0;
import defpackage.qps0;
import defpackage.rps0;
import defpackage.sps0;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 Ô\u00012\u00020\u0001:\nÄ\u0001\u0013Õ\u0001Ö\u0001×\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u00102\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101J)\u00107\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000105H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020*H\u0014¢\u0006\u0004\b:\u0010-J\u0017\u0010<\u001a\u00020\f2\u0006\u00109\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\nH\u0000¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\u00020\u000e2\b\u0010F\u001a\u0004\u0018\u00010\n2\u0006\u0010G\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u00020\u000e2\b\u0010F\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010NJ)\u0010O\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010S\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010TJ1\u0010U\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\fH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000eH\u0002¢\u0006\u0004\b[\u0010\u0018J\u000f\u0010\\\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\\\u0010\u0018J\u001d\u0010^\u001a\u00020\u0006*\u00020\n2\b\b\u0002\u0010]\u001a\u00020\u0006H\u0003¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\u00062\b\b\u0002\u0010]\u001a\u00020\u0006H\u0002¢\u0006\u0004\b`\u0010aJ\u0013\u0010^\u001a\u00020\u0006*\u00020\u0006H\u0003¢\u0006\u0004\b^\u0010aJ\u0013\u0010b\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010XJ\u0013\u0010c\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\bc\u0010dJ\u0013\u0010f\u001a\u00020\u000e*\u00020eH\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00130k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\u001e\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0006¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R3\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u000b\u001a\u00030\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R(\u0010\u008b\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010Z\"\u0006\b\u008e\u0001\u0010\u008f\u0001R0\u0010\u0090\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0090\u0001\u0010s\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R0\u0010\u0095\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010s\u001a\u0006\b\u0096\u0001\u0010\u0092\u0001\"\u0006\b\u0097\u0001\u0010\u0094\u0001R7\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R7\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u009a\u0001\u001a\u0006\b \u0001\u0010\u009c\u0001\"\u0006\b¡\u0001\u0010\u009e\u0001R7\u0010¢\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009a\u0001\u001a\u0006\b£\u0001\u0010\u009c\u0001\"\u0006\b¤\u0001\u0010\u009e\u0001R7\u0010¥\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u009a\u0001\u001a\u0006\b¦\u0001\u0010\u009c\u0001\"\u0006\b§\u0001\u0010\u009e\u0001R'\u0010B\u001a\u00020\n2\u0007\u0010¨\u0001\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\bB\u0010s\u001a\u0006\b©\u0001\u0010\u0092\u0001R8\u0010«\u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010\u009a\u0001\u001a\u0006\b¬\u0001\u0010\u009c\u0001\"\u0006\b\u00ad\u0001\u0010\u009e\u0001R8\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R-\u0010µ\u0001\u001a\u0004\u0018\u00010\n2\t\u0010¨\u0001\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bµ\u0001\u0010v\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R7\u0010»\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u000b\u001a\u0005\u0018\u00010\u0098\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u009a\u0001\u001a\u0006\b¼\u0001\u0010\u009c\u0001\"\u0006\b½\u0001\u0010\u009e\u0001R8\u0010¾\u0001\u001a\u0005\u0018\u00010®\u00012\n\u0010ª\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010°\u0001\u001a\u0006\b¿\u0001\u0010²\u0001\"\u0006\bÀ\u0001\u0010´\u0001R \u0010Á\u0001\u001a\u00020\u00068B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0005\bÃ\u0001\u0010$R\u001c\u0010Å\u0001\u001a\u00070Ä\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ç\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R(\u0010É\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÉ\u0001\u0010\u008c\u0001\u001a\u0005\bÊ\u0001\u0010Z\"\u0006\bË\u0001\u0010\u008f\u0001R0\u0010Ì\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bÌ\u0001\u0010s\u001a\u0006\bÍ\u0001\u0010\u0092\u0001\"\u0006\bÎ\u0001\u0010\u0094\u0001R\u0018\u0010Ï\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010sR\u0018\u0010Ð\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÐ\u0001\u0010sR\u0018\u0010Ñ\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010sR\u001b\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001¨\u0006Ø\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "animated", "Lzy11;", "setThumbValue", "(FZ)V", "setThumbSecondaryValue", "(Ljava/lang/Float;Z)V", "Lqps0;", "listener", "addOnThumbChangedListener", "(Lqps0;)V", "clearOnThumbChangedListener", "()V", "Lsps0;", "setTouchListener$div_release", "(Lsps0;)V", "setTouchListener", "removeTouchListener$div_release", "removeTouchListener", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "getSuggestedMinimumHeight", "()I", "getSuggestedMinimumWidth", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "position", "Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "getClosestThumb$div_release", "(I)Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "getClosestThumb", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchHoverEvent", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "thumb", "setValueToAccessibilityThumb$div_release", "(Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;F)V", "setValueToAccessibilityThumb", "thumbValue", "getPositionInView$div_release", "(F)I", "getPositionInView", "prevValue", "newValue", "notifyThumbChangedListeners", "(Ljava/lang/Float;F)V", "notifyThumbSecondaryChangedListeners", "(Ljava/lang/Float;Ljava/lang/Float;)V", "forced", "trySetThumbValue", "(FZZ)V", "trySetThumbSecondaryValue", "(Ljava/lang/Float;ZZ)V", "desiredSize", "measureSpec", "measureDimension", "(II)I", "setValueToThumb", "(Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;FZZ)V", "getTouchValue", "(I)F", "isThumbSecondaryEnabled", "()Z", "setThumbsInBoarders", "setThumbsOnTickMarks", "viewWidth", "toPosition", "(FI)I", "getTrackLength", "(I)I", "toValue", "inBoarders", "(F)F", "Landroid/animation/ValueAnimator;", "setBaseParams", "(Landroid/animation/ValueAnimator;)V", "Lhps0;", "sliderDrawDelegate", "Lhps0;", "Lbr60;", "thumbChangeListeners", "Lbr60;", "touchListener", "Lsps0;", "sliderAnimator", "Landroid/animation/ValueAnimator;", "prevThumbValue", "F", "sliderSecondaryAnimator", "prevThumbSecondaryValue", "Ljava/lang/Float;", "Lcom/yandex/div/internal/widget/slider/SliderThumbAnimatorListener;", "animatorListener", "Lcom/yandex/div/internal/widget/slider/SliderThumbAnimatorListener;", "animatorSecondaryListener", "", "Lcom/yandex/div/internal/widget/slider/SliderView$a;", "ranges", "Ljava/util/List;", "getRanges", "()Ljava/util/List;", "", "animationDuration", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "animationInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "animationEnabled", "Z", "getAnimationEnabled", "setAnimationEnabled", "(Z)V", "minValue", "getMinValue", "()F", "setMinValue", "(F)V", "maxValue", "getMaxValue", "setMaxValue", "Landroid/graphics/drawable/Drawable;", "activeTickMarkDrawable", "Landroid/graphics/drawable/Drawable;", "getActiveTickMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "setActiveTickMarkDrawable", "(Landroid/graphics/drawable/Drawable;)V", "inactiveTickMarkDrawable", "getInactiveTickMarkDrawable", "setInactiveTickMarkDrawable", "activeTrackDrawable", "getActiveTrackDrawable", "setActiveTrackDrawable", "inactiveTrackDrawable", "getInactiveTrackDrawable", "setInactiveTrackDrawable", "<set-?>", "getThumbValue", "drawable", "thumbDrawable", "getThumbDrawable", "setThumbDrawable", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "thumbTextDrawable", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "getThumbTextDrawable", "()Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "setThumbTextDrawable", "(Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;)V", "thumbSecondaryValue", "getThumbSecondaryValue", "()Ljava/lang/Float;", "Lcom/yandex/div/internal/widget/slider/b;", "a11yHelper", "Lcom/yandex/div/internal/widget/slider/b;", "thumbSecondaryDrawable", "getThumbSecondaryDrawable", "setThumbSecondaryDrawable", "thumbSecondTextDrawable", "getThumbSecondTextDrawable", "setThumbSecondTextDrawable", "maxTickmarkOrThumbWidth", CA20Status.STATUS_USER_I, "getMaxTickmarkOrThumbWidth", "Lpps0;", "activeRange", "Lpps0;", "thumbOnTouch", "Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "interactive", "getInteractive", "setInteractive", "interceptionAngle", "getInterceptionAngle", "setInterceptionAngle", "interceptionAngleTg", "prevX", "prevY", "touchSlop", "Ljava/lang/Integer;", "Companion", "rps0", "a", "Thumb", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class SliderView extends View {
    public static final rps0 Companion = new rps0();
    private final b a11yHelper;
    private final pps0 activeRange;
    private Drawable activeTickMarkDrawable;
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;
    private AccelerateDecelerateInterpolator animationInterpolator;
    private final SliderThumbAnimatorListener animatorListener;
    private final SliderThumbAnimatorListener animatorSecondaryListener;
    private Drawable inactiveTickMarkDrawable;
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;
    private Float prevThumbSecondaryValue;
    private float prevThumbValue;
    private float prevX;
    private float prevY;
    private final List<a> ranges;
    private ValueAnimator sliderAnimator;
    private final hps0 sliderDrawDelegate;
    private ValueAnimator sliderSecondaryAnimator;
    private final br60 thumbChangeListeners;
    private Drawable thumbDrawable;
    private Thumb thumbOnTouch;
    private TextDrawable thumbSecondTextDrawable;
    private Drawable thumbSecondaryDrawable;
    private Float thumbSecondaryValue;
    private TextDrawable thumbTextDrawable;
    private float thumbValue;
    private sps0 touchListener;
    private Integer touchSlop;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "", "THUMB", "THUMB_SECONDARY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Thumb {
        private static final /* synthetic */ Thumb[] $VALUES;
        public static final Thumb THUMB;
        public static final Thumb THUMB_SECONDARY;

        static {
            Thumb thumb = new Thumb("THUMB", 0);
            THUMB = thumb;
            Thumb thumb2 = new Thumb("THUMB_SECONDARY", 1);
            THUMB_SECONDARY = thumb2;
            $VALUES = new Thumb[]{thumb, thumb2};
        }

        public static Thumb valueOf(String str) {
            return (Thumb) Enum.valueOf(Thumb.class, str);
        }

        public static Thumb[] values() {
            return (Thumb[]) $VALUES.clone();
        }
    }

    /* loaded from: classes11.dex */
    public static final class a {
        public float a;
        public float b;
        public int c;
        public int d;
        public Drawable e;
        public Drawable f;
        public int g;
        public int h;

        public final Drawable a() {
            return this.e;
        }

        public final int b() {
            return this.h;
        }

        public final float c() {
            return this.b;
        }

        public final Drawable d() {
            return this.f;
        }

        public final int e() {
            return this.d;
        }

        public final int f() {
            return this.c;
        }

        public final int g() {
            return this.g;
        }

        public final float h() {
            return this.a;
        }

        public final void i(int i) {
            this.h = i;
        }

        public final void j() {
            this.d = 0;
        }

        public final void k() {
            this.c = 0;
        }

        public final void l(int i) {
            this.g = i;
        }
    }

    public SliderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sliderDrawDelegate = new hps0();
        this.thumbChangeListeners = new br60();
        this.animatorListener = new SliderThumbAnimatorListener(new tls() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorListener$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                float f;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SliderView.this.sliderAnimator = null;
                if (!booleanValue) {
                    SliderView sliderView = SliderView.this;
                    f = sliderView.prevThumbValue;
                    sliderView.notifyThumbChangedListeners(Float.valueOf(f), SliderView.this.getThumbValue());
                }
                return zy11.a;
            }
        });
        this.animatorSecondaryListener = new SliderThumbAnimatorListener(new tls() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorSecondaryListener$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Float f;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SliderView.this.sliderSecondaryAnimator = null;
                if (!booleanValue) {
                    SliderView sliderView = SliderView.this;
                    f = sliderView.prevThumbSecondaryValue;
                    sliderView.notifyThumbSecondaryChangedListeners(f, SliderView.this.getThumbSecondaryValue());
                }
                return zy11.a;
            }
        });
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.a11yHelper = new b(this);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new pps0(this);
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0d);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            rps0 rps0Var = Companion;
            Drawable drawable = this.activeTickMarkDrawable;
            rps0Var.getClass();
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(rps0.b(drawable), rps0.b(this.inactiveTickMarkDrawable)), Math.max(rps0.b(this.thumbDrawable), rps0.b(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final float getTouchValue(int position) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? toValue(position) : m810.b(toValue(position));
    }

    private final int getTrackLength(int viewWidth) {
        return ((viewWidth - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    public static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: getTrackLength");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i);
    }

    private final float inBoarders(float f) {
        return Math.min(Math.max(f, this.minValue), this.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private final int measureDimension(int desiredSize, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? desiredSize : size : Math.min(desiredSize, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float prevValue, float newValue) {
        if (jl40.j(prevValue, newValue)) {
            return;
        }
        Iterator it = this.thumbChangeListeners.iterator();
        while (it.hasNext()) {
            ((qps0) it.next()).a(newValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float prevValue, Float newValue) {
        if (jl40.k(prevValue, newValue)) {
            return;
        }
        Iterator it = this.thumbChangeListeners.iterator();
        while (it.hasNext()) {
            ((qps0) it.next()).b(newValue);
        }
    }

    private static final void onDraw$lambda$10$drawTrackPart(a aVar, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2) {
        hps0 hps0Var = sliderView.sliderDrawDelegate;
        if (drawable == null) {
            hps0Var.getClass();
            return;
        }
        drawable.setBounds(i, (hps0Var.b / 2) - (drawable.getIntrinsicHeight() / 2), i2, (drawable.getIntrinsicHeight() / 2) + (hps0Var.b / 2));
        drawable.draw(canvas);
    }

    public static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(a aVar, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
            return;
        }
        if ((i3 & 16) != 0) {
            i = aVar.g();
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = aVar.b();
        }
        onDraw$lambda$10$drawTrackPart(aVar, sliderView, canvas, drawable, i4, i2);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    public static /* synthetic */ void setThumbSecondaryValue$default(SliderView sliderView, Float f, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setThumbSecondaryValue");
            return;
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.setThumbSecondaryValue(f, z);
    }

    public static /* synthetic */ void setThumbValue$default(SliderView sliderView, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setThumbValue");
            return;
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.setThumbValue(f, z);
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f != null ? Float.valueOf(inBoarders(f.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(m810.b(this.thumbValue), false, true);
        if (this.thumbSecondaryValue != null) {
            trySetThumbSecondaryValue(Float.valueOf(m810.b(r0.floatValue())), false, true);
        }
    }

    private final void setValueToThumb(Thumb thumb, float value, boolean animated, boolean forced) {
        int i = c.a[thumb.ordinal()];
        if (i == 1) {
            trySetThumbValue(value, animated, forced);
        } else if (i == 2) {
            trySetThumbSecondaryValue(Float.valueOf(value), animated, forced);
        } else {
            w511.b();
        }
    }

    public static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setValueToThumb");
            return;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        sliderView.setValueToThumb(thumb, f, z, z2);
    }

    private final int toPosition(float f, int i) {
        return m810.b((getTrackLength(i) / (this.maxValue - this.minValue)) * (ffx.W(this) ? this.maxValue - f : f - this.minValue));
    }

    public static /* synthetic */ int toPosition$default(SliderView sliderView, float f, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: toPosition");
            return 0;
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.toPosition(f, i);
    }

    private final float toValue(int i) {
        float f = this.minValue;
        float trackLength$default = ((this.maxValue - f) * i) / getTrackLength$default(this, 0, 1, null);
        if (ffx.W(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1.0f;
        }
        return f + trackLength$default;
    }

    private final void trySetThumbSecondaryValue(Float value, boolean animated, boolean forced) {
        ValueAnimator valueAnimator;
        Float f;
        Float valueOf = value != null ? Float.valueOf(inBoarders(value.floatValue())) : null;
        if (jl40.k(this.thumbSecondaryValue, valueOf)) {
            return;
        }
        if (!animated || !this.animationEnabled || (f = this.thumbSecondaryValue) == null || valueOf == null) {
            if (forced && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (forced || this.sliderSecondaryAnimator == null) {
                Float f2 = this.thumbSecondaryValue;
                this.prevThumbSecondaryValue = f2;
                this.thumbSecondaryValue = valueOf;
                notifyThumbSecondaryChangedListeners(f2, valueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbSecondaryValue = f;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbSecondaryValue.floatValue(), valueOf.floatValue());
            ofFloat.addUpdateListener(new ops0(this, 1));
            ofFloat.addListener(this.animatorSecondaryListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderSecondaryAnimator = ofFloat;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView sliderView, ValueAnimator valueAnimator) {
        sliderView.thumbSecondaryValue = (Float) valueAnimator.getAnimatedValue();
        sliderView.postInvalidateOnAnimation();
    }

    private final void trySetThumbValue(float value, boolean animated, boolean forced) {
        ValueAnimator valueAnimator;
        float inBoarders = inBoarders(value);
        float f = this.thumbValue;
        if (f == inBoarders) {
            return;
        }
        if (animated && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbValue = f;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbValue, inBoarders);
            ofFloat.addUpdateListener(new ops0(this, 0));
            ofFloat.addListener(this.animatorListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderAnimator = ofFloat;
        } else {
            if (forced && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (forced || this.sliderAnimator == null) {
                float f2 = this.thumbValue;
                this.prevThumbValue = f2;
                this.thumbValue = inBoarders;
                notifyThumbChangedListeners(Float.valueOf(f2), this.thumbValue);
            }
        }
        invalidate();
    }

    public static /* synthetic */ void trySetThumbValue$default(SliderView sliderView, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: trySetThumbValue");
            return;
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.trySetThumbValue(f, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView sliderView, ValueAnimator valueAnimator) {
        sliderView.thumbValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        sliderView.postInvalidateOnAnimation();
    }

    public final void addOnThumbChangedListener(qps0 listener) {
        this.thumbChangeListeners.a(listener);
    }

    public final void clearOnThumbChangedListener() {
        this.thumbChangeListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        return this.a11yHelper.c(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.a11yHelper.d(event) || super.dispatchKeyEvent(event);
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    public final Thumb getClosestThumb$div_release(int position) {
        if (isThumbSecondaryEnabled() && Math.abs(position - toPosition$default(this, this.thumbValue, 0, 1, null)) >= Math.abs(position - toPosition$default(this, this.thumbSecondaryValue.floatValue(), 0, 1, null))) {
            return Thumb.THUMB_SECONDARY;
        }
        return Thumb.THUMB;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final int getPositionInView$div_release(float thumbValue) {
        return getPaddingLeft() + toPosition$default(this, thumbValue, 0, 1, null);
    }

    public final List<a> getRanges() {
        return this.ranges;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer num;
        rps0 rps0Var = Companion;
        Drawable drawable = this.activeTrackDrawable;
        rps0Var.getClass();
        int max = Math.max(rps0.a(drawable), rps0.a(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            a aVar = (a) it.next();
            Integer valueOf = Integer.valueOf(Math.max(rps0.a(aVar.a()), rps0.a(aVar.d())));
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                rps0 rps0Var2 = Companion;
                Drawable a2 = aVar2.a();
                rps0Var2.getClass();
                Integer valueOf2 = Integer.valueOf(Math.max(rps0.a(a2), rps0.a(aVar2.d())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 0;
        rps0 rps0Var3 = Companion;
        Drawable drawable2 = this.thumbDrawable;
        rps0Var3.getClass();
        return Math.max(Math.max(rps0.a(drawable2), rps0.a(this.thumbSecondaryDrawable)), Math.max(max, intValue));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i = (int) ((this.maxValue - this.minValue) + 1.0f);
        rps0 rps0Var = Companion;
        Drawable drawable = this.activeTrackDrawable;
        rps0Var.getClass();
        int max = Math.max(Math.max(rps0.b(this.thumbDrawable), rps0.b(this.thumbSecondaryDrawable)), Math.max(rps0.b(drawable), rps0.b(this.inactiveTrackDrawable)) * i);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(max, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202 A[LOOP:2: B:92:0x01ec->B:98:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0205 A[EDGE_INSN: B:99:0x0205->B:79:0x0205 BREAK  A[LOOP:2: B:92:0x01ec->B:98:0x0202], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f;
        float min;
        SliderView sliderView;
        float f2;
        float max;
        Drawable drawable;
        int i;
        int i2;
        TextDrawable textDrawable;
        SliderView sliderView2 = this;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(sliderView2.getPaddingLeft() + (sliderView2.getMaxTickmarkOrThumbWidth() / 2), sliderView2.getPaddingTop());
        int save = canvas2.save();
        for (a aVar : sliderView2.ranges) {
            canvas2.clipRect(aVar.g() - aVar.f(), 0.0f, aVar.e() + aVar.b(), sliderView2.getHeight(), Region.Op.DIFFERENCE);
        }
        hps0 hps0Var = sliderView2.sliderDrawDelegate;
        Drawable drawable2 = sliderView2.inactiveTrackDrawable;
        if (drawable2 == null) {
            hps0Var.getClass();
        } else {
            drawable2.setBounds(0, (hps0Var.b / 2) - (drawable2.getIntrinsicHeight() / 2), hps0Var.a, (drawable2.getIntrinsicHeight() / 2) + (hps0Var.b / 2));
            drawable2.draw(canvas2);
        }
        SliderView sliderView3 = sliderView2.activeRange.a;
        if (sliderView3.isThumbSecondaryEnabled()) {
            float thumbValue = sliderView3.getThumbValue();
            Float thumbSecondaryValue = sliderView3.getThumbSecondaryValue();
            if (thumbSecondaryValue == null) {
                f = thumbValue;
                sliderView = sliderView2.activeRange.a;
                if (sliderView.isThumbSecondaryEnabled()) {
                    max = sliderView.getThumbValue();
                } else {
                    float thumbValue2 = sliderView.getThumbValue();
                    Float thumbSecondaryValue2 = sliderView.getThumbSecondaryValue();
                    if (thumbSecondaryValue2 == null) {
                        f2 = thumbValue2;
                        int position$default = toPosition$default(sliderView2, f, 0, 1, null);
                        int position$default2 = toPosition$default(sliderView2, f2, 0, 1, null);
                        hps0 hps0Var2 = sliderView2.sliderDrawDelegate;
                        drawable = sliderView2.activeTrackDrawable;
                        int i3 = position$default > position$default2 ? position$default2 : position$default;
                        int i4 = position$default2 < position$default ? position$default : position$default2;
                        if (drawable == null) {
                            hps0Var2.getClass();
                        } else {
                            drawable.setBounds(i3, (hps0Var2.b / 2) - (drawable.getIntrinsicHeight() / 2), i4, (drawable.getIntrinsicHeight() / 2) + (hps0Var2.b / 2));
                            drawable.draw(canvas2);
                        }
                        canvas2.restoreToCount(save);
                        for (a aVar2 : sliderView2.ranges) {
                            if (aVar2.b() < position$default || aVar2.g() > position$default2) {
                                sliderView2 = this;
                                canvas2 = canvas;
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, aVar2.d(), 0, 0, 48, null);
                            } else if (aVar2.g() >= position$default && aVar2.b() <= position$default2) {
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, aVar2.a(), 0, 0, 48, null);
                                sliderView2 = this;
                                canvas2 = canvas;
                            } else if (aVar2.g() < position$default && aVar2.b() <= position$default2) {
                                Drawable d = aVar2.d();
                                int i5 = position$default - 1;
                                int g = aVar2.g();
                                int i6 = i5 < g ? g : i5;
                                sliderView2 = this;
                                canvas2 = canvas;
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, d, 0, i6, 16, null);
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, aVar2.a(), position$default, 0, 32, null);
                            } else if (aVar2.g() < position$default || aVar2.b() <= position$default2) {
                                sliderView2 = this;
                                canvas2 = canvas;
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, aVar2.d(), 0, 0, 48, null);
                                onDraw$lambda$10$drawTrackPart(aVar2, sliderView2, canvas2, aVar2.a(), position$default, position$default2);
                            } else {
                                onDraw$lambda$10$drawTrackPart$default(aVar2, this, canvas, aVar2.a(), 0, position$default2, 16, null);
                                Drawable d2 = aVar2.d();
                                int i7 = position$default2 + 1;
                                int b = aVar2.b();
                                int i8 = i7 > b ? b : i7;
                                sliderView2 = this;
                                canvas2 = canvas;
                                onDraw$lambda$10$drawTrackPart$default(aVar2, sliderView2, canvas2, d2, i8, 0, 32, null);
                            }
                        }
                        if ((sliderView2.activeTickMarkDrawable == null || sliderView2.inactiveTickMarkDrawable != null) && (i = (int) sliderView2.minValue) <= (i2 = (int) sliderView2.maxValue)) {
                            while (true) {
                                sliderView2.sliderDrawDelegate.a((i <= ((int) f2) || ((int) f) > i) ? sliderView2.inactiveTickMarkDrawable : sliderView2.activeTickMarkDrawable, sliderView2.toPosition(i), canvas2);
                                if (i == i2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        hps0 hps0Var3 = sliderView2.sliderDrawDelegate;
                        int position$default3 = toPosition$default(sliderView2, sliderView2.thumbValue, 0, 1, null);
                        Drawable drawable3 = sliderView2.thumbDrawable;
                        int i9 = (int) sliderView2.thumbValue;
                        textDrawable = sliderView2.thumbTextDrawable;
                        hps0Var3.a(drawable3, position$default3, canvas2);
                        if (textDrawable != null) {
                            textDrawable.setText(String.valueOf(i9));
                            hps0Var3.a(textDrawable, position$default3, canvas2);
                        }
                        if (sliderView2.isThumbSecondaryEnabled()) {
                            hps0 hps0Var4 = sliderView2.sliderDrawDelegate;
                            int position$default4 = toPosition$default(sliderView2, sliderView2.thumbSecondaryValue.floatValue(), 0, 1, null);
                            Drawable drawable4 = sliderView2.thumbSecondaryDrawable;
                            int floatValue = (int) sliderView2.thumbSecondaryValue.floatValue();
                            TextDrawable textDrawable2 = sliderView2.thumbSecondTextDrawable;
                            hps0Var4.a(drawable4, position$default4, canvas2);
                            if (textDrawable2 != null) {
                                textDrawable2.setText(String.valueOf(floatValue));
                                hps0Var4.a(textDrawable2, position$default4, canvas2);
                            }
                        }
                        canvas2.restore();
                    }
                    max = Math.max(thumbValue2, thumbSecondaryValue2.floatValue());
                }
                f2 = max;
                int position$default5 = toPosition$default(sliderView2, f, 0, 1, null);
                int position$default22 = toPosition$default(sliderView2, f2, 0, 1, null);
                hps0 hps0Var22 = sliderView2.sliderDrawDelegate;
                drawable = sliderView2.activeTrackDrawable;
                if (position$default5 > position$default22) {
                }
                if (position$default22 < position$default5) {
                }
                if (drawable == null) {
                }
                canvas2.restoreToCount(save);
                while (r15.hasNext()) {
                }
                if (sliderView2.activeTickMarkDrawable == null) {
                }
                while (true) {
                    sliderView2.sliderDrawDelegate.a((i <= ((int) f2) || ((int) f) > i) ? sliderView2.inactiveTickMarkDrawable : sliderView2.activeTickMarkDrawable, sliderView2.toPosition(i), canvas2);
                    if (i == i2) {
                    }
                    i++;
                }
                hps0 hps0Var32 = sliderView2.sliderDrawDelegate;
                int position$default32 = toPosition$default(sliderView2, sliderView2.thumbValue, 0, 1, null);
                Drawable drawable32 = sliderView2.thumbDrawable;
                int i92 = (int) sliderView2.thumbValue;
                textDrawable = sliderView2.thumbTextDrawable;
                hps0Var32.a(drawable32, position$default32, canvas2);
                if (textDrawable != null) {
                }
                if (sliderView2.isThumbSecondaryEnabled()) {
                }
                canvas2.restore();
            }
            min = Math.min(thumbValue, thumbSecondaryValue.floatValue());
        } else {
            min = sliderView3.getMinValue();
        }
        f = min;
        sliderView = sliderView2.activeRange.a;
        if (sliderView.isThumbSecondaryEnabled()) {
        }
        f2 = max;
        int position$default52 = toPosition$default(sliderView2, f, 0, 1, null);
        int position$default222 = toPosition$default(sliderView2, f2, 0, 1, null);
        hps0 hps0Var222 = sliderView2.sliderDrawDelegate;
        drawable = sliderView2.activeTrackDrawable;
        if (position$default52 > position$default222) {
        }
        if (position$default222 < position$default52) {
        }
        if (drawable == null) {
        }
        canvas2.restoreToCount(save);
        while (r15.hasNext()) {
        }
        if (sliderView2.activeTickMarkDrawable == null) {
        }
        while (true) {
            sliderView2.sliderDrawDelegate.a((i <= ((int) f2) || ((int) f) > i) ? sliderView2.inactiveTickMarkDrawable : sliderView2.activeTickMarkDrawable, sliderView2.toPosition(i), canvas2);
            if (i == i2) {
            }
            i++;
        }
        hps0 hps0Var322 = sliderView2.sliderDrawDelegate;
        int position$default322 = toPosition$default(sliderView2, sliderView2.thumbValue, 0, 1, null);
        Drawable drawable322 = sliderView2.thumbDrawable;
        int i922 = (int) sliderView2.thumbValue;
        textDrawable = sliderView2.thumbTextDrawable;
        hps0Var322.a(drawable322, position$default322, canvas2);
        if (textDrawable != null) {
        }
        if (sliderView2.isThumbSecondaryEnabled()) {
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        this.a11yHelper.j(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int measureDimension = measureDimension(paddingRight, widthMeasureSpec);
        int measureDimension2 = measureDimension(paddingBottom, heightMeasureSpec);
        setMeasuredDimension(measureDimension, measureDimension2);
        hps0 hps0Var = this.sliderDrawDelegate;
        int trackLength = getTrackLength(measureDimension);
        int paddingTop = (measureDimension2 - getPaddingTop()) - getPaddingBottom();
        hps0Var.a = trackLength;
        hps0Var.b = paddingTop;
        for (a aVar : this.ranges) {
            aVar.l(aVar.f() + toPosition(Math.max(aVar.h(), this.minValue), measureDimension));
            aVar.i(toPosition(Math.min(aVar.c(), this.maxValue), measureDimension) - aVar.e());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int scaledTouchSlop;
        sps0 sps0Var;
        if (this.interactive) {
            int x = (((int) ev.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
            int action = ev.getAction();
            if (action == 0) {
                sps0 sps0Var2 = this.touchListener;
                if (sps0Var2 != null) {
                    ((apf) sps0Var2).v();
                }
                Thumb closestThumb$div_release = getClosestThumb$div_release(x);
                this.thumbOnTouch = closestThumb$div_release;
                setValueToThumb$default(this, closestThumb$div_release, getTouchValue(x), this.animationEnabled, false, 8, null);
                this.prevX = ev.getX();
                this.prevY = ev.getY();
                return true;
            }
            if (action == 1) {
                sps0 sps0Var3 = this.touchListener;
                if (sps0Var3 != null) {
                    ((apf) sps0Var3).u();
                }
                setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x), this.animationEnabled, false, 8, null);
                return true;
            }
            if (action == 2) {
                setValueToThumb(this.thumbOnTouch, getTouchValue(x), false, true);
                Integer num = this.touchSlop;
                if (num != null) {
                    scaledTouchSlop = num.intValue();
                } else {
                    scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    this.touchSlop = Integer.valueOf(scaledTouchSlop);
                }
                float abs = Math.abs(ev.getY() - this.prevY);
                if (abs < scaledTouchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(abs / Math.abs(ev.getX() - this.prevX) <= this.interceptionAngleTg);
                }
                this.prevX = ev.getX();
                this.prevY = ev.getY();
                return true;
            }
            if (action == 3 && (sps0Var = this.touchListener) != null) {
                ((apf) sps0Var).u();
            }
        }
        return false;
    }

    public final void removeTouchListener$div_release() {
        this.touchListener = null;
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j) {
        if (this.animationDuration == j || j < 0) {
            return;
        }
        this.animationDuration = j;
    }

    public final void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z) {
        this.interactive = z;
    }

    public final void setInterceptionAngle(float f) {
        float max = Math.max(45.0f, Math.abs(f) % 90.0f);
        this.interceptionAngle = max;
        this.interceptionAngleTg = (float) Math.tan(max);
    }

    public final void setMaxValue(float f) {
        if (this.maxValue == f) {
            return;
        }
        setMinValue(Math.min(this.minValue, f - 1.0f));
        this.maxValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setMinValue(float f) {
        if (this.minValue == f) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f));
        this.minValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondaryValue(Float value, boolean animated) {
        trySetThumbSecondaryValue(value, animated, true);
    }

    public final void setThumbTextDrawable(TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbValue(float value, boolean animated) {
        trySetThumbValue(value, animated, true);
    }

    public final void setTouchListener$div_release(sps0 listener) {
        this.touchListener = listener;
    }

    public final void setValueToAccessibilityThumb$div_release(Thumb thumb, float value) {
        setValueToThumb(thumb, inBoarders(value), false, true);
    }

    private final int toPosition(int i) {
        return toPosition$default(this, i, 0, 1, null);
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SliderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SliderView(Context context) {
        this(context, null, 0, 6, null);
    }
}
