package com.yandex.div.core.experiments;

import xsna.zcl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'VISUAL_ERRORS_ENABLED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: Experiment.kt */
/* loaded from: classes7.dex */
public final class Experiment {
    public static final Experiment COMPLEX_REBIND_ENABLED;
    public static final Experiment MULTIPLE_STATE_CHANGE_ENABLED;
    public static final Experiment VIEW_POOL_OPTIMIZATION_DEBUG;
    public static final Experiment VISUAL_ERRORS_ENABLED;
    private final boolean defaultValue;
    private final String key;
    public static final Experiment TAP_BEACONS_ENABLED = new Experiment("TAP_BEACONS_ENABLED", 0, "tap_beacons_enabled", false, 2, null);
    public static final Experiment VISIBILITY_BEACONS_ENABLED = new Experiment("VISIBILITY_BEACONS_ENABLED", 1, "visibility_beacons_enabled", false, 2, null);
    public static final Experiment SWIPE_OUT_BEACONS_ENABLED = new Experiment("SWIPE_OUT_BEACONS_ENABLED", 2, "swipe_out_beacons_enabled", true);
    public static final Experiment LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED = new Experiment("LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", 3, "longtap_actions_pass_to_child", false, 2, null);
    public static final Experiment IGNORE_ACTION_MENU_ITEMS_ENABLED = new Experiment("IGNORE_ACTION_MENU_ITEMS_ENABLED", 4, "override_context_menu_handler", false, 2, null);
    public static final Experiment HYPHENATION_SUPPORT_ENABLED = new Experiment("HYPHENATION_SUPPORT_ENABLED", 5, "support_hyphenation", false, 2, null);
    public static final Experiment ACCESSIBILITY_ENABLED = new Experiment("ACCESSIBILITY_ENABLED", 7, "accessibility_enabled", true);
    public static final Experiment VIEW_POOL_ENABLED = new Experiment("VIEW_POOL_ENABLED", 8, "view_pool_enabled", true);
    public static final Experiment VIEW_POOL_PROFILING_ENABLED = new Experiment("VIEW_POOL_PROFILING_ENABLED", 9, "view_pool_profiling_enabled", false, 2, null);
    public static final Experiment RESOURCE_CACHE_ENABLED = new Experiment("RESOURCE_CACHE_ENABLED", 11, "resource_cache_enabled", true);
    public static final Experiment SHOW_RENDERING_TIME = new Experiment("SHOW_RENDERING_TIME", 12, "demo_activity_rendering_time_enabled", false);
    public static final Experiment BIND_ON_ATTACH_ENABLED = new Experiment("BIND_ON_ATTACH_ENABLED", 14, "bind_on_attach_enabled", false, 2, null);
    public static final Experiment PAGER_PAGE_CLIP_ENABLED = new Experiment("PAGER_PAGE_CLIP_ENABLED", 16, "pager_page_children_enabled", true);
    public static final Experiment PERMANENT_DEBUG_PANEL_ENABLED = new Experiment("PERMANENT_DEBUG_PANEL_ENABLED", 17, "permanent_debug_panel_enabled", false);
    public static final Experiment RENDER_EFFECT_ENABLED = new Experiment("RENDER_EFFECT_ENABLED", 18, "render_effect_enabled", false);
    private static final /* synthetic */ Experiment[] $VALUES = $values();

    private static final /* synthetic */ Experiment[] $values() {
        return new Experiment[]{TAP_BEACONS_ENABLED, VISIBILITY_BEACONS_ENABLED, SWIPE_OUT_BEACONS_ENABLED, LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED, IGNORE_ACTION_MENU_ITEMS_ENABLED, HYPHENATION_SUPPORT_ENABLED, VISUAL_ERRORS_ENABLED, ACCESSIBILITY_ENABLED, VIEW_POOL_ENABLED, VIEW_POOL_PROFILING_ENABLED, VIEW_POOL_OPTIMIZATION_DEBUG, RESOURCE_CACHE_ENABLED, SHOW_RENDERING_TIME, MULTIPLE_STATE_CHANGE_ENABLED, BIND_ON_ATTACH_ENABLED, COMPLEX_REBIND_ENABLED, PAGER_PAGE_CLIP_ENABLED, PERMANENT_DEBUG_PANEL_ENABLED, RENDER_EFFECT_ENABLED};
    }

    static {
        zcl zclVar = null;
        VISUAL_ERRORS_ENABLED = new Experiment("VISUAL_ERRORS_ENABLED", 6, "visual_errors", false, 2, zclVar);
        int i = 2;
        zcl zclVar2 = null;
        boolean z = false;
        VIEW_POOL_OPTIMIZATION_DEBUG = new Experiment("VIEW_POOL_OPTIMIZATION_DEBUG", 10, "view_pool_optimization_debug", z, i, zclVar2);
        MULTIPLE_STATE_CHANGE_ENABLED = new Experiment("MULTIPLE_STATE_CHANGE_ENABLED", 13, "multiple_state_change_enabled", z, i, zclVar2);
        COMPLEX_REBIND_ENABLED = new Experiment("COMPLEX_REBIND_ENABLED", 15, "complex_rebind_enabled", false, 2, zclVar);
    }

    private Experiment(String str, int i, String str2, boolean z) {
        this.key = str2;
        this.defaultValue = z;
    }

    public static Experiment valueOf(String str) {
        return (Experiment) Enum.valueOf(Experiment.class, str);
    }

    public static Experiment[] values() {
        return (Experiment[]) $VALUES.clone();
    }

    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    public /* synthetic */ Experiment(String str, int i, String str2, boolean z, int i2, zcl zclVar) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z);
    }
}
