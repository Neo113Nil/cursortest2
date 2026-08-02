package androidx.compose.ui.text;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "Paragraph", "Span", "VerbatimTts", "Url", "Link", "Clickable", "String", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AnnotationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnnotationType[] $VALUES;
    public static final AnnotationType Clickable;
    public static final AnnotationType Link;
    public static final AnnotationType Paragraph;
    public static final AnnotationType Span;
    public static final AnnotationType String;
    public static final AnnotationType Url;
    public static final AnnotationType VerbatimTts;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        Paragraph = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        Span = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        VerbatimTts = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("Url", 3);
        Url = annotationType4;
        AnnotationType annotationType5 = new AnnotationType("Link", 4);
        Link = annotationType5;
        AnnotationType annotationType6 = new AnnotationType("Clickable", 5);
        Clickable = annotationType6;
        AnnotationType annotationType7 = new AnnotationType("String", 6);
        String = annotationType7;
        AnnotationType[] annotationTypeArr = {annotationType, annotationType2, annotationType3, annotationType4, annotationType5, annotationType6, annotationType7};
        $VALUES = annotationTypeArr;
        $ENTRIES = kotlin.enums.a.a(annotationTypeArr);
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) $VALUES.clone();
    }
}
