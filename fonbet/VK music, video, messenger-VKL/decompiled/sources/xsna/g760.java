package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import java.io.File;

/* compiled from: NewEditorScreenFactory.kt */
/* loaded from: classes16.dex */
public interface g760 {

    /* compiled from: NewEditorScreenFactory.kt */
    public interface a {
        void V2(Intent intent);
    }

    void a(Activity activity, s4p s4pVar, com.vk.core.simplescreen.a aVar, gzs gzsVar);

    boolean b(File file);

    com.vk.attachpicker.screen.h c(File file, t4p t4pVar, a aVar, Object obj, String str, wzs wzsVar, SpoilerConfiguration spoilerConfiguration);
}
