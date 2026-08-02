package defpackage;

import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class der extends ModelProvider {
    public final ModelProvider a;

    public der(ModelProvider modelProvider) {
        this.a = modelProvider;
    }

    @Override // com.yandex.runtime.model.ModelProvider
    public final String getId() {
        ModelProvider modelProvider = this.a;
        return g8e.p(modelProvider.getId(), "_", modelProvider.getTexture().getId());
    }

    @Override // com.yandex.runtime.model.ModelProvider
    public final ByteBuffer getModel() {
        return this.a.getModel();
    }

    @Override // com.yandex.runtime.model.ModelProvider
    public final ImageProvider getTexture() {
        return this.a.getTexture();
    }
}
