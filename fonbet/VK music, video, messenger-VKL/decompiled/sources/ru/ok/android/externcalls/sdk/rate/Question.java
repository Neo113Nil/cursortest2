package ru.ok.android.externcalls.sdk.rate;

import xsna.epx;
import xsna.gq;

/* compiled from: Question.kt */
/* loaded from: classes9.dex */
public final class Question {
    private final int index;
    private final String title;

    public Question(int i, String str) {
        this.index = i;
        this.title = str;
    }

    public static /* synthetic */ Question copy$default(Question question, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = question.index;
        }
        if ((i2 & 2) != 0) {
            str = question.title;
        }
        return question.copy(i, str);
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.title;
    }

    public final Question copy(int i, String str) {
        return new Question(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return this.index == question.index && epx.f(this.title, question.title);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        return gq.b(this.index, "Question(index=", ", title=", this.title, ")");
    }
}
