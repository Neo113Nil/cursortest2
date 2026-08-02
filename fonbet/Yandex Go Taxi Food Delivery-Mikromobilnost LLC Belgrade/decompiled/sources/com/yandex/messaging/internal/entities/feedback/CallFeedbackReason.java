package com.yandex.messaging.internal.entities.feedback;

import com.squareup.moshi.Json;
import defpackage.cex;
import java.util.Objects;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class CallFeedbackReason {

    @cex
    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    public final String description;

    @cex
    @Json(name = "name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CallFeedbackReason callFeedbackReason = (CallFeedbackReason) obj;
            if (this.name.equals(callFeedbackReason.name) && this.description.equals(callFeedbackReason.description)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.name, this.description);
    }
}
