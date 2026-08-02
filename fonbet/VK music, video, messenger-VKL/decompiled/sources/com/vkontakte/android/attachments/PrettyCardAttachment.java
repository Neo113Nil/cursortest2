package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.common.links.AwayLink;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.statistic.DeprecatedStatisticPrettyCard;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class PrettyCardAttachment extends Attachment {
    public static final Serializer.c<PrettyCardAttachment> CREATOR = new a();
    public final List<Card> f;

    public static class Button extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Button> CREATOR = new a();
        public String b;
        public ButtonAction c;

        public class a extends Serializer.c<Button> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Button a(@NonNull Serializer serializer) {
                Button button = new Button();
                button.b = serializer.H();
                button.c = (ButtonAction) serializer.G(ButtonAction.class.getClassLoader());
                return button;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(JSONObject jSONObject) {
            this.b = jSONObject.optString("title");
            this.c = new ButtonAction(jSONObject.optJSONObject("action"));
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }
    }

    public class a extends Serializer.c<PrettyCardAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PrettyCardAttachment a(@NonNull Serializer serializer) {
            return new PrettyCardAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrettyCardAttachment[i];
        }
    }

    public PrettyCardAttachment(List<Card> list) {
        this.f = list;
    }

    public final void Db(@Nullable PostInteract postInteract, int i, int i2) {
        for (Card card : this.f) {
            card.l = postInteract;
            card.k = new DeprecatedStatisticPrettyCard(postInteract.g, card.c, i, i2, card.b);
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.f);
    }

    public PrettyCardAttachment(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        this.f = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            this.f.add(new Card(optJSONArray.optJSONObject(i)));
        }
    }

    public PrettyCardAttachment(Serializer serializer) {
        this.f = serializer.j(Card.CREATOR);
    }

    public static class Card extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Card> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final AwayLink e;
        public final String f;
        public final Button g;
        public final Image h;
        public final String i;
        public final String j;

        @Nullable
        public DeprecatedStatisticPrettyCard k;

        @Nullable
        public transient PostInteract l;

        public class a extends Serializer.c<Card> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Card a(@NonNull Serializer serializer) {
                return new Card(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(String str, String str2, String str3, AwayLink awayLink, String str4, Button button, Image image, String str5, String str6, @Nullable DeprecatedStatisticPrettyCard deprecatedStatisticPrettyCard, @Nullable PostInteract postInteract) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = awayLink;
            this.f = str4;
            this.g = button;
            this.h = image;
            this.i = str5;
            this.j = str6;
            this.k = deprecatedStatisticPrettyCard;
            this.l = postInteract;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(@NonNull Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.i0(this.e);
            serializer.j0(this.f);
            serializer.i0(this.g);
            serializer.i0(this.h);
            serializer.j0(this.i);
            serializer.j0(this.j);
            serializer.i0(this.k);
        }

        public Card(JSONObject jSONObject) {
            this.b = jSONObject.optString("card_id");
            this.c = jSONObject.optString("card_data");
            this.d = jSONObject.optString("link_url_target");
            this.e = new AwayLink(jSONObject.optString("link_url"), AwayLink.a.a(jSONObject));
            this.f = jSONObject.optString("title");
            JSONObject optJSONObject = jSONObject.optJSONObject("button");
            if (optJSONObject != null) {
                this.g = new Button(optJSONObject);
            }
            this.i = jSONObject.optString("price");
            this.j = jSONObject.optString("price_old");
            try {
                this.h = new Image(jSONObject.optJSONArray("images"));
            } catch (JSONException unused) {
            }
        }

        public Card(Serializer serializer) {
            this.b = serializer.H();
            this.c = serializer.H();
            this.d = serializer.H();
            this.e = (AwayLink) serializer.G(AwayLink.class.getClassLoader());
            this.f = serializer.H();
            this.g = (Button) serializer.G(Button.class.getClassLoader());
            this.h = (Image) serializer.G(Image.class.getClassLoader());
            this.i = serializer.H();
            this.j = serializer.H();
            this.k = (DeprecatedStatisticPrettyCard) serializer.G(DeprecatedStatisticPrettyCard.class.getClassLoader());
        }
    }
}
