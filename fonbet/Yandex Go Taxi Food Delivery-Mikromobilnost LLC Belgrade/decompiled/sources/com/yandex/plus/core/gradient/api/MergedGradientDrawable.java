package com.yandex.plus.core.gradient.api;

import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/plus/core/gradient/api/MergedGradientDrawable;", "Lcom/yandex/plus/core/gradient/api/PlusDrawable;", "", "drawables", "<init>", "(Ljava/util/List;)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Shader;", "getCurrentShader", "()Landroid/graphics/Shader;", "Ljava/util/List;", "plus-core-gradient_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MergedGradientDrawable extends PlusDrawable {
    private final List<PlusDrawable> drawables;

    /* JADX WARN: Multi-variable type inference failed */
    public MergedGradientDrawable(List<? extends PlusDrawable> list) {
        this.drawables = list;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Iterator<T> it = this.drawables.iterator();
        while (it.hasNext()) {
            ((PlusDrawable) it.next()).draw(canvas);
        }
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable
    public Shader getCurrentShader() {
        int size = this.drawables.size();
        List<PlusDrawable> list = this.drawables;
        int i = 1;
        if (size == 1) {
            return list.get(0).getCurrentShader();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Shader currentShader = ((PlusDrawable) it.next()).getCurrentShader();
            if (currentShader != null) {
                arrayList.add(currentShader);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Shader shader = (Shader) arrayList.get(0);
        int size2 = arrayList.size();
        while (i < size2) {
            ComposeShader composeShader = new ComposeShader(shader, (Shader) arrayList.get(i), PorterDuff.Mode.SRC_OVER);
            i++;
            shader = composeShader;
        }
        return shader;
    }

    @Override // com.yandex.plus.core.gradient.api.PlusDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        Iterator<T> it = this.drawables.iterator();
        while (it.hasNext()) {
            ((PlusDrawable) it.next()).setBounds(bounds);
        }
    }
}
