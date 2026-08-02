package com.yandex.go.navigator.settings.debug_panel.experiment;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/settings/debug_panel/experiment/NavigatorDebugPanelExperiment;", "Ln96;", "Companion", "com/yandex/go/navigator/settings/debug_panel/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorDebugPanelExperiment extends n96 {
    public static final a Companion = new a();
    public final boolean b;

    static {
        new NavigatorDebugPanelExperiment(0);
    }

    public /* synthetic */ NavigatorDebugPanelExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NavigatorDebugPanelExperiment(int i) {
        this.b = false;
    }

    public NavigatorDebugPanelExperiment() {
        this(0);
    }
}
