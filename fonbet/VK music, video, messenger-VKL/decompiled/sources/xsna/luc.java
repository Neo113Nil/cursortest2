package xsna;

import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vkontakte.android.R;

/* compiled from: ClipEditorHistoryItemType.kt */
/* loaded from: classes16.dex */
public interface luc {

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class a implements luc {
        public static final a a = new a();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.ASPECT_RATIO;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_aspect_ratio);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_aspect_ratio);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class b implements luc {
        public static final b a = new b();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.COLOR_CORRECTION;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_filter_applied);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_filter_canceled);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class c implements luc {
        public static final c a = new c();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.SPLIT;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_cut_applied);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_cut_canceled);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class d implements luc {
        public static final d a = new d();

        @Override // xsna.luc
        public final Integer a() {
            return null;
        }

        @Override // xsna.luc
        public final Integer b() {
            return null;
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return null;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class e implements luc {
        public static final e a = new e();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.DOUBLE;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_duplicate_applied);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_duplicate_canceled);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class f implements luc {
        public static final f a = new f();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.SWAP;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_arrangement_changed);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_arrangement_changed);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class g implements luc {
        public static final g a = new g();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.REVERSE;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_reverse_applied);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_reverse_canceled);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class h implements luc {
        public static final h a = new h();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.CROP;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_fragment_length_changed);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_fragment_length_changed);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class i implements luc {
        public static final i a = new i();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.AUDIO_EFFECT;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_sound_effect_applied);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_sound_effect_canceled);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class j implements luc {
        public static final j a = new j();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.SPEED;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_speed_changed);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_speed_changed);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class k implements luc {
        public static final k a = new k();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.VIDEO_TRANSFORMATION;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_transform_changed);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_transform_changed);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    /* compiled from: ClipEditorHistoryItemType.kt */
    public static final class l implements luc {
        public static final l a = new l();
        public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.CHANGE_VOLUME;

        @Override // xsna.luc
        public final Integer a() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_both_volume_changed);
        }

        @Override // xsna.luc
        public final Integer b() {
            return Integer.valueOf(R.string.clips_editor_undo_redo_both_volume_changed);
        }

        @Override // xsna.luc
        public final UndoRedoEventSubtype c() {
            return b;
        }
    }

    Integer a();

    Integer b();

    UndoRedoEventSubtype c();
}
