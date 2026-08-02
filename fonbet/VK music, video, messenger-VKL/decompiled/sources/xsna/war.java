package xsna;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.FileWalkDirection;

/* compiled from: FileTreeWalk.kt */
/* loaded from: classes8.dex */
public final class war implements uki0<File> {
    public final File a;
    public final FileWalkDirection b;

    /* compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
    }

    /* compiled from: FileTreeWalk.kt */
    public final class b extends we<File> {
        public final ArrayDeque<c> b;

        /* compiled from: FileTreeWalk.kt */
        public final class a extends a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;

            @Override // xsna.war.c
            public final File a() {
                int i;
                boolean z = this.e;
                File file = this.a;
                if (!z && this.c == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null && (i = this.d) < fileArr.length) {
                    this.d = i + 1;
                    return fileArr[i];
                }
                if (this.b) {
                    return null;
                }
                this.b = true;
                return file;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        /* renamed from: xsna.war$b$b, reason: collision with other inner class name */
        public final class C3922b extends c {
            public boolean b;

            @Override // xsna.war.c
            public final File a() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        public final class c extends a {
            public boolean b;
            public File[] c;
            public int d;

            @Override // xsna.war.c
            public final File a() {
                boolean z = this.b;
                File file = this.a;
                if (!z) {
                    this.b = true;
                    return file;
                }
                File[] fileArr = this.c;
                if (fileArr != null && this.d >= fileArr.length) {
                    return null;
                }
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null || listFiles.length == 0) {
                        return null;
                    }
                }
                File[] fileArr2 = this.c;
                int i = this.d;
                this.d = i + 1;
                return fileArr2[i];
            }
        }

        /* compiled from: FileTreeWalk.kt */
        public static final /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.b = arrayDeque;
            File file = war.this.a;
            if (file.isDirectory()) {
                arrayDeque.push(a(file));
            } else if (file.isFile()) {
                arrayDeque.push(new C3922b(file));
            } else {
                done();
            }
        }

        public final a a(File file) {
            int i = d.$EnumSwitchMapping$0[war.this.b.ordinal()];
            if (i == 1) {
                return new c(file);
            }
            if (i == 2) {
                return new a(file);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // xsna.we
        public final void computeNext() {
            File file;
            File a2;
            while (true) {
                ArrayDeque<c> arrayDeque = this.b;
                c peek = arrayDeque.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                a2 = peek.a();
                if (a2 == null) {
                    arrayDeque.pop();
                } else if (a2.equals(peek.a) || !a2.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(a(a2));
                }
            }
            file = a2;
            if (file != null) {
                setNext(file);
            } else {
                done();
            }
        }
    }

    /* compiled from: FileTreeWalk.kt */
    public static abstract class c {
        public final File a;

        public c(File file) {
            this.a = file;
        }

        public abstract File a();
    }

    public war(File file, FileWalkDirection fileWalkDirection) {
        this.a = file;
        this.b = fileWalkDirection;
    }

    @Override // xsna.uki0
    public final Iterator<File> iterator() {
        return new b();
    }
}
