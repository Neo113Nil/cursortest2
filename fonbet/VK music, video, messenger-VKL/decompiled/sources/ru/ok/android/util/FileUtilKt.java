package ru.ok.android.util;

import java.io.File;
import java.io.IOException;
import xsna.go9;
import xsna.izs;
import xsna.s3q0;
import xsna.zr;

/* compiled from: FileUtil.kt */
/* loaded from: classes9.dex */
public final class FileUtilKt {
    public static final void deleteSafely(File file, izs<? super String, s3q0> izsVar) {
        try {
            Files.delete(file);
        } catch (Exception e) {
            if (izsVar != null) {
                izsVar.invoke("Exception during file deleting: " + e.getMessage());
            }
        }
    }

    public static /* synthetic */ void deleteSafely$default(File file, izs izsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            izsVar = null;
        }
        deleteSafely(file, izsVar);
    }

    public static final void ensureDirExist(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException(zr.a("File ", file.getAbsolutePath(), " does not have a parent"));
        }
        parentFile.mkdirs();
        if (!parentFile.exists()) {
            throw new IOException(go9.b("Can not create directories for ", file.getAbsolutePath()));
        }
    }
}
