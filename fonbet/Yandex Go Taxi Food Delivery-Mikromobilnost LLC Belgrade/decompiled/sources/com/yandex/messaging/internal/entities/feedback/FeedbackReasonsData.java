package com.yandex.messaging.internal.entities.feedback;

import com.squareup.moshi.Json;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class FeedbackReasonsData {
    public static final FeedbackReasonsData a = new FeedbackReasonsData();

    @Json(name = "AudioReasons")
    public List<CallFeedbackReason> audioReasons = new ArrayList();

    @Json(name = "VideoReasons")
    public List<CallFeedbackReason> videoReasons = new ArrayList();
}
