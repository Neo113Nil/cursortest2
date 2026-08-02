package xsna;

import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.suggestions.model.SuggestionVariant;

/* compiled from: GroupsSuggestionsInfoItemModel.kt */
/* loaded from: classes5.dex */
public final class mru extends s4h {
    public final GroupsSuggestions b;
    public final UserId c;
    public final String d;
    public final SuggestionVariant e;

    public mru(GroupsSuggestions groupsSuggestions, UserId userId, String str, SuggestionVariant suggestionVariant) {
        this.b = groupsSuggestions;
        this.c = userId;
        this.d = str;
        this.e = suggestionVariant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mru)) {
            return false;
        }
        mru mruVar = (mru) obj;
        return epx.f(this.b, mruVar.b) && epx.f(this.c, mruVar.c) && epx.f(this.d, mruVar.d) && this.e == mruVar.e;
    }

    public final int hashCode() {
        int a = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        String str = this.d;
        return this.e.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "GroupsSuggestionsInfoItemModel(data=" + this.b + ", profileId=" + this.c + ", referrer=" + this.d + ", suggestionVariant=" + this.e + ')';
    }
}
