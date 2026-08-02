package xsna;

import java.io.File;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l84 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ File c;

    public /* synthetic */ l84(File file, int i) {
        this.b = i;
        this.c = file;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        File file = this.c;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    file.delete();
                }
                break;
            default:
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
                break;
        }
        return s3q0.a;
    }
}
