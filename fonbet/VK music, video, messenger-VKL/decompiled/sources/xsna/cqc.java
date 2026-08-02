package xsna;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.files.a;
import com.vk.richcontent.impl.TemporalContentRepository;
import java.io.File;
import kotlin.io.FileSystemException;
import xsna.wjg0;

/* compiled from: ClipDataItemToTemporalFileTransformer.kt */
/* loaded from: classes5.dex */
public final class cqc implements dqc {
    public final Context a;

    public cqc(Context context) {
        this.a = context;
    }

    @Override // xsna.dqc
    public final wjg0 a(ClipData.Item item) {
        Uri uri = item.getUri();
        File e = PrivateFiles.e(e8r.a, PrivateSubdir.TEMP_UPLOADS, null, com.vk.core.files.a.E(uri), 24);
        TemporalContentRepository.CopyWithResultListener copyWithResultListener = new TemporalContentRepository.CopyWithResultListener();
        copyWithResultListener.a = TemporalContentRepository.CopyWithResultListener.CopyState.NOT_COMPLETED;
        a.b.a(this.a, uri, e, copyWithResultListener);
        int i = TemporalContentRepository.a.$EnumSwitchMapping$0[copyWithResultListener.a.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Illegal state: after copying state == NOT_COMPLETED");
        }
        if (i != 2) {
            return new wjg0.a(item.getUri(), e);
        }
        throw new FileSystemException(e, null, null);
    }

    @Override // xsna.dqc
    public final boolean b(ClipData.Item item) {
        return item.getUri() != null;
    }
}
