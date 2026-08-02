package xsna;

import com.vk.photoeditor.engine.ChronicleException;
import com.vk.photoeditor.engine.PhotoEditorEngine;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qoy implements PhotoEditorEngine.a {
    public static int b(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String c(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    @Override // com.vk.photoeditor.engine.PhotoEditorEngine.a
    public void a(ChronicleException chronicleException) {
    }
}
