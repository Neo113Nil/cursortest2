package xsna;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes12.dex */
public final class y820 implements gq90, keu {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final MergePaths e;

    /* compiled from: MergePathsContent.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public y820(MergePaths mergePaths) {
        this.e = mergePaths;
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((gq90) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @TargetApi(19)
    public final void d(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            gq90 gq90Var = (gq90) arrayList.get(size);
            if (gq90Var instanceof igj) {
                igj igjVar = (igj) gq90Var;
                ArrayList arrayList2 = (ArrayList) igjVar.h();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((gq90) arrayList2.get(size2)).getPath();
                    Matrix matrix = igjVar.d;
                    ikp0 ikp0Var = igjVar.l;
                    if (ikp0Var != null) {
                        matrix = ikp0Var.e();
                    } else {
                        matrix.reset();
                    }
                    path3.transform(matrix);
                    path.addPath(path3);
                }
            } else {
                path.addPath(gq90Var.getPath());
            }
        }
        int i = 0;
        gq90 gq90Var2 = (gq90) arrayList.get(0);
        if (gq90Var2 instanceof igj) {
            igj igjVar2 = (igj) gq90Var2;
            List<gq90> h = igjVar2.h();
            while (true) {
                ArrayList arrayList3 = (ArrayList) h;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((gq90) arrayList3.get(i)).getPath();
                Matrix matrix2 = igjVar2.d;
                ikp0 ikp0Var2 = igjVar2.l;
                if (ikp0Var2 != null) {
                    matrix2 = ikp0Var2.e();
                } else {
                    matrix2.reset();
                }
                path4.transform(matrix2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(gq90Var2.getPath());
        }
        this.c.op(path2, path, op);
    }

    @Override // xsna.gq90
    public final Path getPath() {
        Path path = this.c;
        path.reset();
        MergePaths mergePaths = this.e;
        if (!mergePaths.b) {
            int i = a.a[mergePaths.a.ordinal()];
            if (i == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((gq90) arrayList.get(i2)).getPath());
                    i2++;
                }
            } else {
                if (i == 2) {
                    d(Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    d(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    d(Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    d(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // xsna.keu
    public final void h(ListIterator<gfj> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            gfj previous = listIterator.previous();
            if (previous instanceof gq90) {
                this.d.add((gq90) previous);
                listIterator.remove();
            }
        }
    }
}
