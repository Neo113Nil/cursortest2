package ru.ok.android.externcalls.sdk.ml.model;

import java.io.File;
import xsna.efz;
import xsna.epx;
import xsna.urd0;

/* compiled from: MLModelCheckResult.kt */
/* loaded from: classes9.dex */
public interface MLModelCheckResult {

    /* compiled from: MLModelCheckResult.kt */
    public static final class Disabled implements MLModelCheckResult {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disabled);
        }

        public int hashCode() {
            return -1300392114;
        }

        public String toString() {
            return "Disabled";
        }
    }

    /* compiled from: MLModelCheckResult.kt */
    public interface Enabled extends MLModelCheckResult {

        /* compiled from: MLModelCheckResult.kt */
        public static final class ExistentModel implements Enabled {
            private final File file;

            public ExistentModel(File file) {
                this.file = file;
            }

            public static /* synthetic */ ExistentModel copy$default(ExistentModel existentModel, File file, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = existentModel.file;
                }
                return existentModel.copy(file);
            }

            public final File component1() {
                return this.file;
            }

            public final ExistentModel copy(File file) {
                return new ExistentModel(file);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExistentModel) && epx.f(this.file, ((ExistentModel) obj).file);
            }

            @Override // ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult.Enabled
            public File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            public String toString() {
                return "ExistentModel(file=" + this.file + ")";
            }
        }

        /* compiled from: MLModelCheckResult.kt */
        public static final class UpdatedModel implements Enabled {
            private final long downloadDurationMs;
            private final File file;
            private final String version;

            public UpdatedModel(File file, String str, long j) {
                this.file = file;
                this.version = str;
                this.downloadDurationMs = j;
            }

            public static /* synthetic */ UpdatedModel copy$default(UpdatedModel updatedModel, File file, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    file = updatedModel.file;
                }
                if ((i & 2) != 0) {
                    str = updatedModel.version;
                }
                if ((i & 4) != 0) {
                    j = updatedModel.downloadDurationMs;
                }
                return updatedModel.copy(file, str, j);
            }

            public final File component1() {
                return this.file;
            }

            public final String component2() {
                return this.version;
            }

            public final long component3() {
                return this.downloadDurationMs;
            }

            public final UpdatedModel copy(File file, String str, long j) {
                return new UpdatedModel(file, str, j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UpdatedModel)) {
                    return false;
                }
                UpdatedModel updatedModel = (UpdatedModel) obj;
                return epx.f(this.file, updatedModel.file) && epx.f(this.version, updatedModel.version) && this.downloadDurationMs == updatedModel.downloadDurationMs;
            }

            public final long getDownloadDurationMs() {
                return this.downloadDurationMs;
            }

            @Override // ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult.Enabled
            public File getFile() {
                return this.file;
            }

            public final String getVersion() {
                return this.version;
            }

            public int hashCode() {
                return Long.hashCode(this.downloadDurationMs) + urd0.a(this.file.hashCode() * 31, 31, this.version);
            }

            public String toString() {
                File file = this.file;
                String str = this.version;
                long j = this.downloadDurationMs;
                StringBuilder sb = new StringBuilder("UpdatedModel(file=");
                sb.append(file);
                sb.append(", version=");
                sb.append(str);
                sb.append(", downloadDurationMs=");
                return efz.b(j, ")", sb);
            }
        }

        File getFile();
    }
}
