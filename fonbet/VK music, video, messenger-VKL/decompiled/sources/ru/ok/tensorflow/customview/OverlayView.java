package ru.ok.tensorflow.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes11.dex */
public class OverlayView extends View {
    private final CopyOnWriteArraySet<DrawCallback> callbacks;

    /* loaded from: classes9.dex */
    public interface DrawCallback {
        void draw(@NonNull Canvas canvas);
    }

    public OverlayView(@NonNull Context context) {
        super(context);
        this.callbacks = new CopyOnWriteArraySet<>();
    }

    public void addCallback(DrawCallback drawCallback) {
        if (drawCallback != null) {
            this.callbacks.add(drawCallback);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Iterator<DrawCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().draw(canvas);
        }
    }

    public void removeCallback(DrawCallback drawCallback) {
        if (drawCallback != null) {
            this.callbacks.remove(drawCallback);
        }
    }

    public OverlayView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.callbacks = new CopyOnWriteArraySet<>();
    }

    public OverlayView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.callbacks = new CopyOnWriteArraySet<>();
    }
}
