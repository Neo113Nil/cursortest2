package xsna;

import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import java.util.List;

/* compiled from: MediaPickerFacadeImpl.kt */
/* loaded from: classes3.dex */
public final class qt10 implements lt10 {
    public final MediaPickerConfiguration a;
    public final List<tt10> b;
    public final bu10 c;

    /* JADX WARN: Multi-variable type inference failed */
    public qt10(MediaPickerConfiguration mediaPickerConfiguration, List<? extends tt10> list, pt10 pt10Var) {
        this.a = mediaPickerConfiguration;
        this.b = list;
        this.c = pt10Var.a;
    }

    @Override // xsna.lt10
    public final bu10 b() {
        return this.c;
    }

    @Override // xsna.lt10
    public final MediaPickerConfiguration getConfig() {
        return this.a;
    }

    @Override // xsna.lt10
    public final List<tt10> getFilters() {
        return this.b;
    }
}
