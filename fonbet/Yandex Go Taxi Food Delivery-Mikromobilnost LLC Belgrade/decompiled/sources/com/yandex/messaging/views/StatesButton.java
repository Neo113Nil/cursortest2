package com.yandex.messaging.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.eaj0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vqc;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n0\t¢\u0006\u0004\b\r\u0010\u000eB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n0\t¢\u0006\u0004\b\r\u0010\u000fB'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u00102\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/yandex/messaging/views/StatesButton;", "T", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "states", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/util/List;)V", "(Landroid/content/Context;Ljava/util/List;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onClick", "()V", "indexFrom", "indexTo", "transit", "(II)V", "Ljava/util/List;", "Lkotlin/Function1;", "onStateChange", "Ltls;", "getOnStateChange", "()Ltls;", "setOnStateChange", "(Ltls;)V", "Lvqc;", "duration", "J", "getDuration-CP40Q1Q", "()J", "setDuration-leAFHzY", "(J)V", "value", "currentIndex", CA20Status.STATUS_USER_I, "setCurrentIndex", "(I)V", "currentDrawable", "Landroid/graphics/drawable/Drawable;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState", "(Ljava/lang/Object;)V", "currentState", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StatesButton<T> extends AppCompatImageView {
    public static final int $stable = 8;
    private final Drawable currentDrawable;
    private int currentIndex;
    private long duration;
    private tls onStateChange;
    private List<? extends Pair<? extends Drawable, ? extends T>> states;

    public StatesButton(Context context, AttributeSet attributeSet, int i, List<? extends Pair<? extends Drawable, ? extends T>> list) {
        super(context, attributeSet, i);
        this.states = list;
        this.duration = vqc.b(300L);
        Drawable drawable = (Drawable) this.states.get(this.currentIndex).c();
        this.currentDrawable = drawable;
        setOnClickListener(new eaj0(27, this));
        setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick() {
        setCurrentIndex(this.currentIndex + 1);
    }

    private final void setCurrentIndex(int i) {
        if (i < 0) {
            ny61.r("Index can't be negative");
        } else {
            if (this.states.isEmpty()) {
                ny61.r("No states provided");
                return;
            }
            int size = i % this.states.size();
            transit(this.currentIndex, size);
            this.currentIndex = size;
        }
    }

    private final void transit(int indexFrom, int indexTo) {
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{(Drawable) this.states.get(indexFrom).c(), (Drawable) this.states.get(indexTo).c()});
        transitionDrawable.setCrossFadeEnabled(true);
        setImageDrawable(transitionDrawable);
        transitionDrawable.startTransition((int) this.duration);
        tls tlsVar = this.onStateChange;
        if (tlsVar != null) {
            tlsVar.invoke(this.states.get(indexTo).f());
        }
    }

    public final T getCurrentState() {
        return (T) this.states.get(this.currentIndex).f();
    }

    /* renamed from: getDuration-CP40Q1Q, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final tls getOnStateChange() {
        return this.onStateChange;
    }

    public final void setCurrentState(T t) {
        Iterator<? extends Pair<? extends Drawable, ? extends T>> it = this.states.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(it.next().getSecond(), t)) {
                break;
            } else {
                i++;
            }
        }
        if (i != this.currentIndex) {
            setCurrentIndex(i);
        }
    }

    /* renamed from: setDuration-leAFHzY, reason: not valid java name */
    public final void m226setDurationleAFHzY(long j) {
        this.duration = j;
    }

    public final void setOnStateChange(tls tlsVar) {
        this.onStateChange = tlsVar;
    }

    public StatesButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StatesButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public StatesButton(Context context, List<? extends Pair<? extends Drawable, ? extends T>> list) {
        this(context, null, 0, list);
    }

    public /* synthetic */ StatesButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public StatesButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, EmptyList.a);
    }
}
