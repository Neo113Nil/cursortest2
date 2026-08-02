package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class ko1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AiWidgetEvaluationItemType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
