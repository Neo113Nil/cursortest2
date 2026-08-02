package defpackage;

import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;
import com.airbnb.lottie.parser.moshi.c;

/* loaded from: classes10.dex */
public abstract class nr10 {
    public static final hzk a = hzk.n("nm", "mm", "hd");

    public static kr10 a(c cVar) {
        String str = null;
        boolean z = false;
        MergePaths$MergePathsMode mergePaths$MergePathsMode = null;
        while (cVar.hasNext()) {
            int o = cVar.o(a);
            if (o == 0) {
                str = cVar.nextString();
            } else if (o == 1) {
                int nextInt = cVar.nextInt();
                mergePaths$MergePathsMode = nextInt != 1 ? nextInt != 2 ? nextInt != 3 ? nextInt != 4 ? nextInt != 5 ? MergePaths$MergePathsMode.MERGE : MergePaths$MergePathsMode.EXCLUDE_INTERSECTIONS : MergePaths$MergePathsMode.INTERSECT : MergePaths$MergePathsMode.SUBTRACT : MergePaths$MergePathsMode.ADD : MergePaths$MergePathsMode.MERGE;
            } else if (o != 2) {
                cVar.v();
                cVar.skipValue();
            } else {
                z = cVar.nextBoolean();
            }
        }
        return new kr10(str, mergePaths$MergePathsMode, z);
    }
}
