package com.yandex.quark.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/quark/utils/CircleOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "Lcom/yandex/quark/utils/CircleOutlineProvider$DiameterSource;", "diameterSource", "<init>", "(Lcom/yandex/quark/utils/CircleOutlineProvider$DiameterSource;)V", "Landroid/view/View;", "", "diameter", "(Landroid/view/View;)I", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "Lcom/yandex/quark/utils/CircleOutlineProvider$DiameterSource;", "DiameterSource", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CircleOutlineProvider extends ViewOutlineProvider {
    private final DiameterSource diameterSource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/quark/utils/CircleOutlineProvider$DiameterSource;", "", "WIDTH", "HEIGHT", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiameterSource {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DiameterSource[] $VALUES;
        public static final DiameterSource HEIGHT;
        public static final DiameterSource WIDTH;

        static {
            DiameterSource diameterSource = new DiameterSource("WIDTH", 0);
            WIDTH = diameterSource;
            DiameterSource diameterSource2 = new DiameterSource("HEIGHT", 1);
            HEIGHT = diameterSource2;
            DiameterSource[] diameterSourceArr = {diameterSource, diameterSource2};
            $VALUES = diameterSourceArr;
            $ENTRIES = kotlin.enums.a.a(diameterSourceArr);
        }

        public static DiameterSource valueOf(String str) {
            return (DiameterSource) Enum.valueOf(DiameterSource.class, str);
        }

        public static DiameterSource[] values() {
            return (DiameterSource[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CircleOutlineProvider(DiameterSource diameterSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DiameterSource.HEIGHT : diameterSource);
    }

    private final int diameter(View view) {
        int i = a.a[this.diameterSource.ordinal()];
        if (i == 1) {
            return view.getWidth();
        }
        if (i == 2) {
            return view.getHeight();
        }
        w511.b();
        return 0;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        int diameter = diameter(view);
        outline.setRoundRect(0, 0, diameter, diameter, diameter / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircleOutlineProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CircleOutlineProvider(DiameterSource diameterSource) {
        this.diameterSource = diameterSource;
    }
}
