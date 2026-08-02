package xsna;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import xsna.aq90;

/* compiled from: NioSystemFileSystem.kt */
/* loaded from: classes11.dex */
public final class f270 extends wby {
    public static Long i(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // xsna.wby, xsna.tar
    public final void a(aq90 aq90Var, aq90 aq90Var2) {
        try {
            Files.move(Paths.get(aq90Var.b.A(), new String[0]), Paths.get(aq90Var2.b.A(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // xsna.wby, xsna.tar
    public final n9r e(aq90 aq90Var) {
        Path path = Paths.get(aq90Var.b.A(), new String[0]);
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = aq90.c;
                aq90.a.a(readSymbolicLink.toString(), false);
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long i = creationTime != null ? i(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long i2 = lastModifiedTime != null ? i(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new n9r(isRegularFile, isDirectory, valueOf, i, i2, lastAccessTime != null ? i(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // xsna.wby
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
