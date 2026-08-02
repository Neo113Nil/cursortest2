package ru.ok.tracer.lite;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;
import xsna.erm0;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TagsStorageLite.kt */
/* loaded from: classes11.dex */
public final class TagsStorageLite {
    public static final Companion Companion = new Companion(null);
    private final int maxKeysCount;
    private final ConcurrentHashMap<String, String> mutableTags;

    /* compiled from: TagsStorageLite.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TagsStorageLite get(TracerLite tracerLite) {
            return tracerLite.getTagsStorage$tracer_lite_commons_release();
        }

        private Companion() {
        }
    }

    public TagsStorageLite(int i) {
        this.maxKeysCount = i;
        this.mutableTags = new ConcurrentHashMap<>();
    }

    public final List<String> getTags() {
        ListBuilder e = e43.e();
        synchronized (this.mutableTags) {
            try {
                for (Map.Entry<String, String> entry : this.mutableTags.entrySet()) {
                    e.add(entry.getKey() + "=" + entry.getValue());
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e.g();
    }

    public final void setKey(String str, String str2) {
        String D0 = erm0.D0(31, str);
        String D02 = str2 != null ? erm0.D0(31, str2) : null;
        synchronized (this.mutableTags) {
            try {
                String remove = this.mutableTags.remove(D0);
                if (D02 != null) {
                    this.mutableTags.put(D0, D02);
                    if (remove == null && this.mutableTags.size() > this.maxKeysCount) {
                        this.mutableTags.entrySet().iterator().remove();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ozl
    public TagsStorageLite() {
        this(30);
    }
}
