package com.yandex.plus.home.feature.webviews.internal.stories.contract;

import com.yandex.plus.home.feature.webviews.internal.stories.StoryNavigation;
import com.yandex.plus.log.api.LogPriority;
import defpackage.kv80;
import defpackage.pgz;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class StoriesWebViewContract$addAdditionalMessageHandlers$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kv80 kv80Var = (kv80) obj;
        a aVar = (a) this.receiver;
        pgz pgzVar = aVar.A;
        String str = aVar.B;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, str, "handleShowPrevStoryEvent() outMessage=" + kv80Var);
        }
        aVar.z.a.navigateStory(StoryNavigation.SHOW_PREV_STORY);
        return zy11.a;
    }
}
