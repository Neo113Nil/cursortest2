package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;

/* compiled from: VideoScreenCatalogBlockEvent.kt */
/* loaded from: classes16.dex */
public interface fet0 extends wnk {

    /* compiled from: VideoScreenCatalogBlockEvent.kt */
    public static final class a implements fet0 {
        public final BlockId a;
        public final VideoAlbum b;
        public final Image c;

        public a(BlockId blockId, VideoAlbum videoAlbum, Image image) {
            this.a = blockId;
            this.b = videoAlbum;
            this.c = image;
        }
    }

    /* compiled from: VideoScreenCatalogBlockEvent.kt */
    public static final class b implements fet0 {
        public final VideoFile a;

        public b(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: VideoScreenCatalogBlockEvent.kt */
    public static final class c implements fet0 {
        public final VideoFile a;

        public c(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: VideoScreenCatalogBlockEvent.kt */
    public static final class d implements fet0 {
        public final BlockId.Simple a;

        public d(BlockId.Simple simple) {
            this.a = simple;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "OpenUploadShortVideo(blockId=" + this.a + ')';
        }
    }

    /* compiled from: VideoScreenCatalogBlockEvent.kt */
    public static final class e implements fet0 {
        public final VideoFile a;
        public final String b;

        public e(VideoFile videoFile, String str) {
            this.a = videoFile;
            this.b = str;
        }
    }
}
