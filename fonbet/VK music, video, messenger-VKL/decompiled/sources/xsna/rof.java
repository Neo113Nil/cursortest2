package xsna;

import com.vk.toggle.features.ClipsFeatures;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ClipsViewerExperimentsGrid.kt */
/* loaded from: classes16.dex */
public final class rof {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(rof.class, "isNewViewsFormatEnabled", "isNewViewsFormatEnabled()Z", 0), fp.c(0, rof.class, "isGridBatchDisabled", "isGridBatchDisabled()Z", fpf0.a)};
    public final e18 a;
    public final e18 b;

    public rof(kuq kuqVar) {
        this.a = kuqVar.a(ClipsFeatures.NEW_VIEWS_FORMAT);
        this.b = kuqVar.a(ClipsFeatures.CLIPS_DISABLE_GRID_BATCH);
    }

    public final boolean a() {
        return this.b.getValue(this, c[1]).booleanValue();
    }

    public final boolean b() {
        return this.a.getValue(this, c[0]).booleanValue();
    }
}
