package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay;

import defpackage.l190;
import defpackage.tkr;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/overlay/DefaultOverlayManager;", "Ll190;", "<init>", "()V", "", "tag", "", "contains", "(Ljava/lang/String;)Z", "Ltkr;", "flexOverlayController", "Lzy11;", "addOverlay", "(Ljava/lang/String;Ltkr;)V", "getOverlay", "(Ljava/lang/String;)Ltkr;", "evictOverlay", "", "overlays", "Ljava/util/Map;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultOverlayManager implements l190 {
    private final Map<String, tkr> overlays = new LinkedHashMap();

    @Override // defpackage.l190
    public void addOverlay(String tag, tkr flexOverlayController) {
        this.overlays.put(tag, flexOverlayController);
    }

    @Override // defpackage.l190
    public boolean contains(String tag) {
        return this.overlays.containsKey(tag);
    }

    @Override // defpackage.l190
    public tkr evictOverlay(String tag) {
        return this.overlays.remove(tag);
    }

    @Override // defpackage.l190
    public tkr getOverlay(String tag) {
        return this.overlays.get(tag);
    }
}
