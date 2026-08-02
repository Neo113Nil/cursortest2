package com.yandex.div.core.view2.divs;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1 extends Lambda implements wls {
    final /* synthetic */ wls $animations;
    final /* synthetic */ GestureDetector $gestureDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1(wls wlsVar, GestureDetector gestureDetector) {
        super(2);
        this.$animations = wlsVar;
        this.$gestureDetector = gestureDetector;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        MotionEvent motionEvent = (MotionEvent) obj2;
        wls wlsVar = this.$animations;
        if (wlsVar != null) {
            wlsVar.invoke(view, motionEvent);
        }
        GestureDetector gestureDetector = this.$gestureDetector;
        return Boolean.valueOf(gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : false);
    }
}
