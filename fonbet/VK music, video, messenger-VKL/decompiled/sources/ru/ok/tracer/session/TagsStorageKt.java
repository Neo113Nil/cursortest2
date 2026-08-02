package ru.ok.tracer.session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.emb;
import xsna.nbr;
import xsna.s3q0;

/* compiled from: TagsStorage.kt */
/* loaded from: classes9.dex */
public final class TagsStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> readTags(File file) {
        if (file.exists()) {
            try {
                return nbr.q(file);
            } catch (IOException unused) {
                file.toString();
            }
        }
        return EmptyList.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeTags(File file, List<String> list) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), emb.b);
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                outputStreamWriter.write(it.next());
                outputStreamWriter.write(10);
            }
            s3q0 s3q0Var = s3q0.a;
            outputStreamWriter.close();
        } finally {
        }
    }
}
