package xsna;

import com.yandex.div.core.state.DivStatePath;
import java.io.File;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gpn implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ gpn(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int alphabeticalComparator$lambda$2;
        switch (this.b) {
            case 0:
                alphabeticalComparator$lambda$2 = DivStatePath.Companion.alphabeticalComparator$lambda$2((DivStatePath) obj, (DivStatePath) obj2);
                return alphabeticalComparator$lambda$2;
            default:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    }
}
