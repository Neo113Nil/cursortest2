package com.yandex.div.core.experiments;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/experiments/Experiment;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "", "defaultValue", "Z", "a", "()Z", "TAP_BEACONS_ENABLED", "VISIBILITY_BEACONS_ENABLED", "SWIPE_OUT_BEACONS_ENABLED", "LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", "IGNORE_ACTION_MENU_ITEMS_ENABLED", "HYPHENATION_SUPPORT_ENABLED", "VISUAL_ERRORS_ENABLED", "ACCESSIBILITY_ENABLED", "VIEW_POOL_ENABLED", "VIEW_POOL_PROFILING_ENABLED", "VIEW_POOL_OPTIMIZATION_DEBUG", "RESOURCE_CACHE_ENABLED", "SHOW_RENDERING_TIME", "MULTIPLE_STATE_CHANGE_ENABLED", "BIND_ON_ATTACH_ENABLED", "COMPLEX_REBIND_ENABLED", "PAGER_PAGE_CLIP_ENABLED", "PERMANENT_DEBUG_PANEL_ENABLED", "RENDER_EFFECT_ENABLED", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Experiment {
    TAP_BEACONS_ENABLED("tap_beacons_enabled", false),
    VISIBILITY_BEACONS_ENABLED("visibility_beacons_enabled", false),
    SWIPE_OUT_BEACONS_ENABLED("swipe_out_beacons_enabled", true),
    LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED("longtap_actions_pass_to_child", false),
    IGNORE_ACTION_MENU_ITEMS_ENABLED("override_context_menu_handler", false),
    HYPHENATION_SUPPORT_ENABLED("support_hyphenation", false),
    VISUAL_ERRORS_ENABLED("visual_errors", false),
    ACCESSIBILITY_ENABLED("accessibility_enabled", true),
    VIEW_POOL_ENABLED("view_pool_enabled", true),
    VIEW_POOL_PROFILING_ENABLED("view_pool_profiling_enabled", false),
    VIEW_POOL_OPTIMIZATION_DEBUG("view_pool_optimization_debug", false),
    RESOURCE_CACHE_ENABLED("resource_cache_enabled", true),
    SHOW_RENDERING_TIME("demo_activity_rendering_time_enabled", false),
    MULTIPLE_STATE_CHANGE_ENABLED("multiple_state_change_enabled", false),
    BIND_ON_ATTACH_ENABLED("bind_on_attach_enabled", false),
    COMPLEX_REBIND_ENABLED("complex_rebind_enabled", false),
    PAGER_PAGE_CLIP_ENABLED("pager_page_children_enabled", true),
    PERMANENT_DEBUG_PANEL_ENABLED("permanent_debug_panel_enabled", false),
    RENDER_EFFECT_ENABLED("render_effect_enabled", false);

    private final boolean defaultValue;
    private final String key;

    Experiment(String str, boolean z) {
        this.key = str;
        this.defaultValue = z;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDefaultValue() {
        return this.defaultValue;
    }
}
