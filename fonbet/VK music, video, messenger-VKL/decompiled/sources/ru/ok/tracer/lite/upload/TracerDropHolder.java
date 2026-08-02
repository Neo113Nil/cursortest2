package ru.ok.tracer.lite.upload;

import android.content.Context;
import kotlin.Lazy;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.TracerLiteFiles;
import xsna.bpn0;
import xsna.gzs;
import xsna.nbr;
import xsna.zcl;

/* compiled from: TracerDropHolder.kt */
/* loaded from: classes11.dex */
public final class TracerDropHolder {
    public static final Companion Companion = new Companion(null);
    private final Lazy dropManager$delegate;

    /* compiled from: TracerDropHolder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final DropManager get(TracerLite tracerLite) {
            return tracerLite.getDropHolder$tracer_lite_commons_release().getDropManager();
        }

        private Companion() {
        }
    }

    public TracerDropHolder(final Context context, final String str) {
        this.dropManager$delegate = new bpn0(new gzs<DropManager>() { // from class: ru.ok.tracer.lite.upload.TracerDropHolder$dropManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public final DropManager invoke() {
                return new DropManager(nbr.t(TracerLiteFiles.INSTANCE.getTracerLiteDir$tracer_lite_commons_release(context, str), "drops.json"));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DropManager getDropManager() {
        return (DropManager) this.dropManager$delegate.getValue();
    }
}
